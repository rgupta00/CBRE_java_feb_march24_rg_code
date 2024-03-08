package com.bankapp.service;

import com.bankapp.dto.AccountDto;
import com.bankapp.dto.AccountHolderDetailsDto;

import java.math.BigDecimal;
import java.util.List;

//S O L I D
//SRP ISP
public interface TransactionService {
    public void transfer(int fromAccId, int toAccId, BigDecimal amount);
    public void deposit(int accId, BigDecimal amount);
    public void withdraw(int accId, BigDecimal amount);
}
