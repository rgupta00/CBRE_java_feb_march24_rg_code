package com.bankapp.service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.dao.AccountDaoImplUsingMap;
import com.bankapp.exceptions.AccountNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "accountService") //accountServiceImpl
public class AccountServiceImpl implements AccountService{

    //field setter const
    private AccountDao accountDao;

    private Logger logger= LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> getAll() {
        return accountDao.getAll();
    }

    @Override
    public Account getById(int id) {
        Account account=accountDao.getById(id);
        if(account==null){
            throw new AccountNotFoundException("account with id "+ id +"is not found");
        }
        return account;
    }

    //SL=BL+Logging(CCC) :(
    //my code + ccc => tanggled
    //I wnat there should a declartive way to handle ccc code

    @Override
    public void transfer(int fromAccId, int toAccId, double amount) {
        Account fromAcc=accountDao.getById(fromAccId);
        Account toAcc=accountDao.getById(toAccId);

        fromAcc.setBalance(fromAcc.getBalance()-amount);
        toAcc.setBalance(toAcc.getBalance()+amount);

        accountDao.updateAccount(toAcc);
        accountDao.updateAccount(fromAcc);

    }

    @Override
    public void deposit(int accId, double amount) {
        System.out.println("deposit stared");
        Account acc=accountDao.getById(accId);
        acc.setBalance(acc.getBalance()+amount);
    }

    @Override
    public void withdraw(int accId, double amount) {
        System.out.println("withdraws= stared");
        Account acc=accountDao.getById(accId);
        acc.setBalance(acc.getBalance()-amount);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void addAccount(Account account) {
        accountDao.addAccount(account);
    }

    @Override
    public void deleteAccount(int id) {
        accountDao.deleteAccount(id);
    }
}
