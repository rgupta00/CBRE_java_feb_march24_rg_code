package com.bankapp.controller;

import com.bankapp.config.AppConfig;
import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.dao.AccountDaoImplJdbc;
import com.bankapp.service.AccountService;
import com.bankapp.service.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        AccountDao accountDao=new AccountDaoImplJdbc();
//        AccountService accountService=new AccountServiceImpl(accountDao);

        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService accountService= ctx.getBean("accService",AccountService.class);

        List<Account> accounts=accountService.getAllAccounts();
        accounts.forEach(a-> System.out.println(a));
        accountService.transfer(1,2,10);

        System.out.println("--------------------");
        accounts=accountService.getAllAccounts();
        accounts.forEach(a-> System.out.println(a));
    }
}