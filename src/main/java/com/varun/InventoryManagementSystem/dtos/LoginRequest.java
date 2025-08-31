package com.varun.InventoryManagementSystem.dtos;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginRequest {
    @NotBlank(message = "username can't be blank")
    private String userName;

    @NotBlank(message = "password can't be blank")
    private String password;
}
