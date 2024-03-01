package com.bankapp.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
@Primary
public class AccountDaoImplJdbc implements AccountDao{
    private Map<Integer, Account> accounts=new HashMap<>();

    public AccountDaoImplJdbc() {
        accounts.put(1, new Account(1, "raj", 1000.00));
        accounts.put(2, new Account(2, "ekta", 1000.00));
    }
    @Override
    public List<Account> getAll() {
        System.out.println("getAll using jdbc...");
        return new ArrayList<Account>(accounts.values());
    }

    @Override
    public Account getById(int id) {
        return accounts.get(id);
    }

    @Override
    public void updateAccount(Account account) {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        accounts.put(account.getId(), account);
    }

    @Override
    public void addAccount(Account account) {

    }

    @Override
    public void deleteAccount(int id) {

    }
}
