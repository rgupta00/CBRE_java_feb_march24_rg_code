package com.bankapp.api;

import com.bankapp.dto.AccountDto;
import com.bankapp.repo.AccountRepo;
import com.bankapp.service.AccountService;
import com.bankapp.service.AccountServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//api/v1/accountoperation/accounts
@RestController
@RequestMapping(path = "api/v1/accountoperation")
public class AccountApi {
    private AccountService accountService;
    private Logger logger= LoggerFactory.getLogger(AccountApi.class);
    @Autowired
    public AccountApi(AccountService accountService) {
        this.accountService = accountService;
    }


    //get all accounts
    @GetMapping(path = "accounts")
    public List<AccountDto> getAll(){
        return accountService.getAll();
    }
    //get by id

    //add account

    //update account details

    //delete
}
