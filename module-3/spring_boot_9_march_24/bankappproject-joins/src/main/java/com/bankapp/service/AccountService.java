package com.bankapp.service;

import com.bankapp.dto.AccountDto;
import com.bankapp.dto.AccountHolderDetailsDto;
import com.bankapp.entities.Account;

import java.math.BigDecimal;
import java.util.List;
//S O L I D
//SRP ISP
public interface AccountService {
    public List<Account> getAll();
    public Account getById(int id);

    public void updateAccountHolderDetails(int id,
                                           AccountHolderDetailsDto accountHolderDetails);
    public void addAccount(Account account);
    public void deleteAccount(int id);
}
