package com.bayu.transferservice.controller;

import com.bayu.bankmanagementservice.dto.bank.GetBankRequest;
import com.bayu.transferservice.dto.BankDTO;
import com.bayu.transferservice.service.BankService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api
@Slf4j
@RestController
public class BankController {

    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @PostMapping("/bank")
    public BankDTO getBankById(@RequestBody GetBankRequest request) {
        return bankService.getBankById(String.valueOf(request.getBankId()));
    }
}
