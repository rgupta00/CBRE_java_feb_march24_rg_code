package com.bankapp.api;

import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//action vs resouce meaning?
@RestController
@RequestMapping(path = "api/v1/transaction")
public class TranactionApi {

    private TransactionService transactionService;

    private Environment environment;

    @Autowired
    public TranactionApi(TransactionService transactionService, Environment environment) {
        this.transactionService = transactionService;
        this.environment = environment;
    }

    @PostMapping(path = "transfer")
    public String transfer(@RequestBody TransferDto transferDto){
        transactionService.transfer(transferDto.getFromAccountId(),
                transferDto.getToAccountId(), transferDto.getAmount());
      return  environment.getProperty("UserInterface.TRANSFER_SUCCESS");
    }

    @PostMapping(path = "deposit")
    public String deposit(@RequestBody DepositDto depositDto){
        transactionService.deposit(depositDto.getAccId(), depositDto.getAmount());
        return "fund is deposit succssfully";
    }

    @PostMapping(path = "withdraw")
    public String withdraw(@RequestBody WithdrawDto withdrawDto){
        transactionService.withdraw(withdrawDto.getAccId(), withdrawDto.getAmount());
        return "fund is withdrawDto succssfully";
    }
}
