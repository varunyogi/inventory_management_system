package com.varun.InventoryManagementSystem.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.varun.InventoryManagementSystem.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {


    private Long id;
    @NotBlank(message = "Please provide name")
    private String name;
    @Column(unique = true)
    private String email;
    @JsonIgnore
    private String password;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    private List<TransactionDTO> transactions;
    private  LocalDateTime createdAt;


}
