package com.bayu.transferservice.controller;

import com.bayu.bankmanagementservice.dto.bank.GetBankRequest;
import com.bayu.bankmanagementservice.dto.bank.ListBankResponse;
import com.bayu.transferservice.dto.BankDTO;
import com.bayu.transferservice.service.BankService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

    @ApiOperation("Get Bank List")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success Condition",response = ListBankResponse.class)
//            @ApiResponse(code = 400, message = "Error request format", response = ErrorDetail.class),
//            @ApiResponse(code = 500, message = "Internal server error", response = ErrorDetail.class),
//            @ApiResponse(code = 401, message = "Session token is required", response = ErrorDetail.class),
//            @ApiResponse(code = 403, message = "Forbidden for this request", response = ErrorDetail.class)
    })
    // url processor : http://localhost:8081/bank
    // url data : http://localhost:8080/api/bank/getBankById
    @PostMapping("/bank")
    public BankDTO getBankById(@RequestBody GetBankRequest request) {
        return bankService.getBankById(String.valueOf(request.getBankId()));
    }

}
