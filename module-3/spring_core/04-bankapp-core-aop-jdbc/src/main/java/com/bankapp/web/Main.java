package com.bankapp.web;

import com.bankapp.config.AppConfig;
import com.bankapp.dao.Account;
import com.bankapp.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //-Dspring.profiles.active=dev
        //how to use it in real project: spring boot jar
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService accountService=ctx.getBean("accountService",AccountService.class);
        accountService.deposit(1,200);
       //accountService.transfer(1, 2, 40);


       // System.out.println(accountService);
//        List<Account> accounts=accountService.getAll();
//        accounts.forEach(a-> System.out.println(a));
//
//        accountService.transfer(1, 2, 10);
//        System.out.println("-----------after transfer--------");
//       accounts=accountService.getAll();
//        accounts.forEach(a-> System.out.println(a));

    }
}
