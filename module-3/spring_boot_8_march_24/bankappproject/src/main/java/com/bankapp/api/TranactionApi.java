package com.bankapp.api;

import com.bankapp.config.MsgConfig;
import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//action vs resouce meaning?
@RestController
@RequestMapping(path = "api/v1/transaction")
@AllArgsConstructor
public class TranactionApi {

    private final TransactionService transactionService;

   private final  MsgConfig msgConfig;


    @PostMapping(path = "transfer")
    public String transfer(@RequestBody TransferDto transferDto){
        transactionService.transfer(transferDto.getFromAccountId(),
                transferDto.getToAccountId(), transferDto.getAmount());
      return  msgConfig.getTransferSuccess();
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
