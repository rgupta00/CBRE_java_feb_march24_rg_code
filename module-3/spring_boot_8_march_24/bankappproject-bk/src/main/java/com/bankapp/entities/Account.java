package com.bankapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account_table")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String name;
    private BigDecimal balance;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String phone;

    public Account(String name, BigDecimal balance, String email, String phone) {
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.phone = phone;
    }
}







