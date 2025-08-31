package com.varun.InventoryManagementSystem.dtos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.varun.InventoryManagementSystem.enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionRequest {

    @Positive(message = "valid product ID is required")
    private Long productId;

    @Positive(message = "valid quantity  is required")
    private Integer quantity;

    @NotBlank(message = "password can't be blank")
    private Long supplierId;

    private String description;

    private String note;
}
