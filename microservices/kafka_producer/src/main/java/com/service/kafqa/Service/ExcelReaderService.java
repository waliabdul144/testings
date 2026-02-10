package com.service.kafqa.Service;

import com.service.kafqa.Modal.CustomerOrder;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.monitorjbl.xlsx.StreamingReader;



import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.model.StylesTable;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

@Service
public class ExcelReaderService<Workbook extends AutoCloseable> {

    public static void readExcelFile(String filePath) {
        List<CustomerOrder> orders = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             org.apache.poi.ss.usermodel.Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            int rowCount = 0;

            System.out.println("Starting to read Excel file...");
            long startTime = System.currentTimeMillis();

            for (Row row : sheet) {
                // Skip header row
                if (row.getRowNum() == 0) {
                    continue;
                }

                CustomerOrder order = new CustomerOrder();

                order.setCustomerId(getLongValue(row.getCell(0)));
                order.setFirstName(getStringValue(row.getCell(1)));
                order.setLastName(getStringValue(row.getCell(2)));
                order.setEmail(getStringValue(row.getCell(3)));
                order.setAge(getIntValue(row.getCell(4)));
                order.setGender(getStringValue(row.getCell(5)));
                order.setCountry(getStringValue(row.getCell(6)));
                order.setCity(getStringValue(row.getCell(7)));
                order.setProductId(getIntValue(row.getCell(8)));
                order.setProductCategory(getStringValue(row.getCell(9)));
                order.setQuantity(getIntValue(row.getCell(10)));
                order.setUnitPrice(getDoubleValue(row.getCell(11)));
                order.setTotalAmount(getDoubleValue(row.getCell(12)));
                order.setOrderDate(getDateValue(row.getCell(13)));
                order.setStatus(getStringValue(row.getCell(14)));

                orders.add(order);
                rowCount++;

                // Progress indicator
                if (rowCount % 100000 == 0) {
                    System.out.println("Processed " + rowCount + " rows...");
                }
            }

            long endTime = System.currentTimeMillis();
            System.out.println("✓ Finished reading " + rowCount + " rows in " +
                    (endTime - startTime) / 1000.0 + " seconds");

        } catch (IOException e) {
            System.err.println("Error reading Excel file: " + e.getMessage());
            e.printStackTrace();
        }

    }

    // Helper methods to safely extract cell values
    private static String getStringValue(Cell cell) {
        if (cell == null) return null;
        return cell.getCellType() == CellType.STRING ?
                cell.getStringCellValue() : String.valueOf(cell.getNumericCellValue());
    }

    private static Long getLongValue(Cell cell) {
        if (cell == null) return null;
        return (long) cell.getNumericCellValue();
    }

    private static Integer getIntValue(Cell cell) {
        if (cell == null) return null;
        return (int) cell.getNumericCellValue();
    }

    private static Double getDoubleValue(Cell cell) {
        if (cell == null) return null;
        return cell.getNumericCellValue();
    }

    private static LocalDate getDateValue(Cell cell) {
        if (cell == null) return null;
        if (cell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(cell)) {
            Date date = cell.getDateCellValue();
            return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
        return null;
    }


    public static List<CustomerOrder> readExcelFileStreaming(String filePath) {
        List<CustomerOrder> orders = new ArrayList<>();

        try (OPCPackage pkg = OPCPackage.open(new File(filePath))) {

            XSSFReader reader = new XSSFReader(pkg);
            SharedStringsTable sst = (SharedStringsTable) reader.getSharedStringsTable();
            StylesTable styles = reader.getStylesTable();

            XSSFReader.SheetIterator sheets = (XSSFReader.SheetIterator) reader.getSheetsData();

            while (sheets.hasNext()) {
                try (InputStream sheetStream = sheets.next()) {
                    System.out.println("reading " + orders.size() + " rows");


                    SAXParserFactory factory = SAXParserFactory.newInstance();
                    SAXParser saxParser = factory.newSAXParser();
                    XMLReader sheetParser = saxParser.getXMLReader();

                    CustomSheetHandler handler = new CustomSheetHandler(orders);
                    ContentHandler contentHandler = new XSSFSheetXMLHandler(
                            styles, sst, handler, false
                    );

                    sheetParser.setContentHandler(contentHandler);
                    sheetParser.parse(new InputSource(sheetStream));
                }
            }

            System.out.println("✓ Finished reading " + orders.size() + " rows");
            return orders;

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
            return orders;
        }
    }

    // Custom handler to process rows

}
