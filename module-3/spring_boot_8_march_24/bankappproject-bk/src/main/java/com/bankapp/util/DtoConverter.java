package com.bankapp.util;

import com.bankapp.dto.AccountDto;
import com.bankapp.entities.Account;

public class DtoConverter {

    //account to accoutDto
    public static AccountDto toAccountDto(Account account){
        AccountDto accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setName(account.getName());
        accountDto.setBalance(account.getBalance());
        accountDto.setEmail(account.getEmail());
        accountDto.setPhone(account.getPhone());
        return accountDto;
    }

    //accountDto to account
    public static Account toAccount(AccountDto accountDto){
        Account account = new Account();
        account.setId(accountDto.getId());
        account.setName(accountDto.getName());
        account.setBalance(accountDto.getBalance());
        account.setEmail(accountDto.getEmail());
        account.setPhone(accountDto.getPhone());
        return account;
    }
}
