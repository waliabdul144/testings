package com.service.kafqa.Service;

import com.service.kafqa.Modal.CustomerOrder;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFComment;


public class CustomSheetHandler implements XSSFSheetXMLHandler.SheetContentsHandler {
    private final List<CustomerOrder> orders;
    private List<String> currentRow = new ArrayList<>();
    private int rowNum = 0;

    public CustomSheetHandler(List<CustomerOrder> orders) {
        this.orders = orders;
    }

    @Override
    public void startRow(int rowNumber) {
        currentRow.clear();
    }

    @Override
    public void endRow(int rowNumber) {
        if (rowNumber == 0) return; // Skip header

        if (currentRow.size() >= 15) {
            CustomerOrder order = new CustomerOrder();
            order.setCustomerId(parseLong(currentRow.get(0)));
            order.setFirstName(currentRow.get(1));
            order.setLastName(currentRow.get(2));
            order.setEmail(currentRow.get(3));
            order.setAge(parseInt(currentRow.get(4)));
            order.setGender(currentRow.get(5));
            order.setCountry(currentRow.get(6));
            order.setCity(currentRow.get(7));
            order.setProductId(parseInt(currentRow.get(8)));
            order.setProductCategory(currentRow.get(9));
            order.setQuantity(parseInt(currentRow.get(10)));
            order.setUnitPrice(parseDouble(currentRow.get(11)));
            order.setTotalAmount(parseDouble(currentRow.get(12)));
            order.setOrderDate(parseDate(currentRow.get(13)));
            order.setStatus(currentRow.get(14));

            orders.add(order);
            rowNum++;

            if (rowNum % 100000 == 0) {
                System.out.println("Processed " + rowNum + " rows...");
            }
        }
    }

    @Override
    public void cell(String cellReference, String formattedValue, XSSFComment comment) {

    }

    @Override
    public void headerFooter(String text, boolean isHeader, String tagName) {
        XSSFSheetXMLHandler.SheetContentsHandler.super.headerFooter(text, isHeader, tagName);
    }

    @Override
    public void endSheet() {
        XSSFSheetXMLHandler.SheetContentsHandler.super.endSheet();
    }

    private Long parseLong(String value) {
        try { return value != null ? Long.parseLong(value.split("\\.")[0]) : null; }
        catch (Exception e) { return null; }
    }

    private Integer parseInt(String value) {
        try { return value != null ? Integer.parseInt(value.split("\\.")[0]) : null; }
        catch (Exception e) { return null; }
    }

    private Double parseDouble(String value) {
        try { return value != null ? Double.parseDouble(value) : null; }
        catch (Exception e) { return null; }
    }

    private LocalDate parseDate(String value) {
        // Handle Excel date format
        try {
            if (value != null && value.contains("-")) {
                return LocalDate.parse(value);
            }
        } catch (Exception e) {}
        return null;
    }
}