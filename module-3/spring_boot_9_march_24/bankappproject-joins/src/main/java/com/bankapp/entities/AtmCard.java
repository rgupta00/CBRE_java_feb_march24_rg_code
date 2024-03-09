package com.bankapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account_table")
public class AtmCard {
    private int cardId;
    private String cardCode;
    private String initiatedBy;
    private String status;
    private LocalDate issueDate;
    private LocalDate expireDate;


}

