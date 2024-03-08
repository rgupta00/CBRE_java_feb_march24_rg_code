package com.bankapp.service;

import com.bankapp.entities.Account;
import com.bankapp.exceptions.ResourceNotFoundException;
import com.bankapp.repo.AccountRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
@Service
@Transactional
public class TransactionServiceImpl implements TransactionService{


    private AccountRepo accountRepo;

    @Autowired
    public TransactionServiceImpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    private Logger logger= LoggerFactory.getLogger(AccountServiceImpl.class);

    @Override
    public void transfer(int fromAccId, int toAccId, BigDecimal amount) {

        Account fromAcc=accountRepo.findById(fromAccId)
                .orElseThrow(()->new ResourceNotFoundException("account by id "+fromAccId +" is not found"));

        Account toAcc=accountRepo.findById(toAccId)
                .orElseThrow(()->new ResourceNotFoundException("account by id "+toAccId +" is not found"));

        fromAcc.setBalance(fromAcc.getBalance().subtract(amount));
        toAcc.setBalance(toAcc.getBalance().add(amount));

        accountRepo.save(fromAcc);

        accountRepo.save(toAcc);

        logger.info("fund is transfered");

    }

    @Override
    public void deposit(int accId, BigDecimal amount) {
        Account acc=accountRepo.findById(accId)
                .orElseThrow(()->new ResourceNotFoundException("account by id "+accId +" is not found"));

        acc.setBalance(acc.getBalance().add(amount));
        accountRepo.save(acc);
    }

    @Override
    public void withdraw(int accId, BigDecimal amount) {
        Account acc=accountRepo.findById(accId)
                .orElseThrow(()->new ResourceNotFoundException("account by id "+accId +" is not found"));

        acc.setBalance(acc.getBalance().subtract(amount));
        accountRepo.save(acc);

    }

}
