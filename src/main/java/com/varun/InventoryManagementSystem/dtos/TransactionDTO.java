package com.varun.InventoryManagementSystem.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.varun.InventoryManagementSystem.enums.TransactionStatus;
import com.varun.InventoryManagementSystem.enums.TransactionType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDTO {


    private Long id;

    @Positive(message = "Total products can't be negative")
    private Integer totalProducts;
    @Positive(message = "Total price can't be negative")
    private BigDecimal totalPrice;
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;
    private String description;
    private String note;
    private  LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private ProductDTO product;

    private UserDTO user;

    private SupplierDTO supplier;
}
