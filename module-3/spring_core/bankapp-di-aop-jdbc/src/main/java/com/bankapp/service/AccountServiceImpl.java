package com.bankapp.service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.dao.AccountDaoImplJdbc;
import com.bankapp.dao.AccountDaoImplMap;
import com.bankapp.exceptions.BankAccountNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//ravi
@Service(value = "accService")
public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;
    private EmailService emailService;



    @Autowired
    public AccountServiceImpl(AccountDao accountDao, EmailService emailService) {
        this.accountDao = accountDao;
        this.emailService = emailService;
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountDao.getAll();
    }

    @Override
    public Account getById(int id) {
        Account account=accountDao.getById(id);

        if(account==null)
            throw new BankAccountNotFoundException("account "+ id+" not found");
        return account;
    }

    @Override
    public void addAccount(Account account) {
        //data valation
        accountDao.addAccount(account);
    }

    @Override
    public void deleteAccount(int id) {
            accountDao.deleteAccount(id);
    }

    @Override
    public void transfer(int fromAccId, int toAccId, double amount) {
        Account fromAcc=accountDao.getById(fromAccId);
        Account toAcc= accountDao.getById(toAccId);

        fromAcc.setBalance(fromAcc.getBalance()-amount);

        toAcc.setBalance(toAcc.getBalance()+amount);

        accountDao.updateAccount(fromAcc);
        accountDao.updateAccount(toAcc);

    }

    @Override
    public void deposit(int accId, double amount) {
        Account acc=accountDao.getById(accId);
        acc.setBalance(acc.getBalance()+amount);
    }

    @Override
    public void withdraw(int accId, double amount) {
        Account acc=accountDao.getById(accId);
        acc.setBalance(acc.getBalance()-amount);
    }
}
