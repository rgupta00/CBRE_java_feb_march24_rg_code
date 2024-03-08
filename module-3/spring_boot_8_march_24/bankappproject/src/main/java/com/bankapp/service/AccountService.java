package com.bankapp.service;

import com.bankapp.dto.AccountDto;
import com.bankapp.dto.AccountHolderDetailsDto;

import java.math.BigDecimal;
import java.util.List;
//S O L I D
//SRP ISP
public interface AccountService {
    public List<AccountDto> getAll();
    public AccountDto getById(int id);

    public void updateAccountHolderDetails(int id,
                                           AccountHolderDetailsDto accountHolderDetails);
    public void addAccount(AccountDto accountDto);
    public void deleteAccount(int id);
}
