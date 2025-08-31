package com.varun.InventoryManagementSystem.dtos;


import com.varun.InventoryManagementSystem.enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegistrationRequest {

    @NotBlank(message = "name can't be blank")
    private String name;
    @NotBlank(message = "username can't be blank")
    private String userName;

    @NotBlank(message = "password can't be blank")
    private String password;

    private UserRole userRole;
}
