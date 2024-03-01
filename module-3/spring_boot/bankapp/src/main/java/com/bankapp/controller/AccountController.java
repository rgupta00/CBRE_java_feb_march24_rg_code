package com.bankapp.controller;

import com.bankapp.dao.Account;
import com.bankapp.dto.TransferDto;
import com.bankapp.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Parser jakson json <---> java
@RestController
@AllArgsConstructor
public class AccountController {

   private final AccountService accountService;
   private final Environment environment;


    //get all the accounts
    @GetMapping(path = "accounts")
    public List<Account> getAll(){
       return accountService.getAll();
    }
    //get an account by id, What we need to handle ex handing
    @GetMapping(path = "accounts/{id}")
    public Account getById(@PathVariable int id){
       return accountService.getById(id);
    }

   // transfer
    @PostMapping(path = "transfer")
    public String transfer(@RequestBody TransferDto transferDto){
       accountService.transfer(transferDto.getFromAccId(), transferDto.getToAccountId(), transferDto.getAmount());
       String message= environment.getProperty("TRASFER.SUCCESS.MESSAGE");
       return  message;
    }
    // deposit

    // withdraw

    // add new acc

    //del acc
    
    //update add


}
