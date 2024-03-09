package com.bankapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tx_history_table")
public class TransactionHistory {
    private int txId;
    private int fromAcc;
    private int toAcc;
    private BigDecimal amount;
    private String initiatedBy;
    private String status;
    private LocalDateTime localDateTime;
}
