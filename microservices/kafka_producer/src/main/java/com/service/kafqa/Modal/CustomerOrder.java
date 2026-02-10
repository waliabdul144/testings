package com.service.kafqa.Modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrder {
    private Long customerId;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private String gender;
    private String country;
    private String city;
    private Integer productId;
    private String productCategory;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;
    private LocalDate orderDate;
    private String status;
}