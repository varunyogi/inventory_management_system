package com.varun.InventoryManagementSystem.models;

import com.varun.InventoryManagementSystem.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Data
@Builder
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Please provide name")
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions;
    private final LocalDateTime createdAt = LocalDateTime.now();

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role=" + role +
                ", transactions=" + transactions +
                ", createdAt=" + createdAt +
                '}';
    }
}
