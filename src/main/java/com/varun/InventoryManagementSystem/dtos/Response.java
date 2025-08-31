package com.varun.InventoryManagementSystem.dtos;


import ch.qos.logback.core.util.Loader;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.varun.InventoryManagementSystem.enums.UserRole;
import com.varun.InventoryManagementSystem.models.User;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    //Generic
    private int status;
    private String message;

    //for login
    private String token;
    private UserRole role;
    private String expirationTime;

    //for pagination
    private Integer totalPages;
    private Long totalElements;

    //data output optionals
    private UserDTO user;
    private List<UserDTO> users;

    private SupplierDTO supplier;
    private List<UserDTO> suppliers;

    private CategoryDTO category;
    private List<CategoryDTO> categories;

    private TransactionDTO transaction;
    private List<TransactionDTO> transactions;

    private ProductDTO product;
    private List<ProductDTO> products;

    private final LocalDateTime timestamp= LocalDateTime.now();
}
