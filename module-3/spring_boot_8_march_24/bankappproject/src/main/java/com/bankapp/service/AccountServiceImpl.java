package com.bankapp.service;

import com.bankapp.dto.AccountDto;
import com.bankapp.dto.AccountHolderDetailsDto;
import com.bankapp.entities.Account;
import com.bankapp.exceptions.ResourceNotFoundException;
import com.bankapp.repo.AccountRepo;
import com.bankapp.util.DtoConverter;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Transactional// u can refer a blog
//https://www.marcobehler.com/guides/spring-transaction-management-transactional-in-depth
@Service
public class AccountServiceImpl implements AccountService{

    private  AccountRepo accountRepo;
    private Logger logger= LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    public AccountServiceImpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public List<AccountDto> getAll() {
        return accountRepo.findAll().stream().map(DtoConverter::toAccountDto).toList();
    }

    @Override
    public AccountDto getById(int id) {
        return  accountRepo.findById(id)
                .map(DtoConverter::toAccountDto)
                .orElseThrow(()->new ResourceNotFoundException("account by id "+id +" is not found"));
    }


    @Override
    public void updateAccountHolderDetails(int id, AccountHolderDetailsDto accountHolderDetails) {
        Account acc=accountRepo.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("account by id "+id +" is not found"));
        acc.setEmail(accountHolderDetails.getEmail());
        acc.setPhone(accountHolderDetails.getPhone());
        accountRepo.save(acc);

    }

    @Override
    public void addAccount(AccountDto accountDto) {
        Account account=DtoConverter.toAccount(accountDto);
        accountRepo.save(account);
    }

    @Override
    public void deleteAccount(int id) {
        Account acc=accountRepo.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("account by id "+id +" is not found"));
        accountRepo.delete(acc);

    }
}
