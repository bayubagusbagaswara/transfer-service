package com.bayu.transferservice.service.impl;

import com.bayu.bankmanagementservice.dto.bank.GetBankRequest;
import com.bayu.bankmanagementservice.dto.bank.GetBankResponse;
import com.bayu.integration.BankManagementService;
import com.bayu.transferservice.dto.BankDTO;
import com.bayu.transferservice.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    BankManagementService bankManagementService;

    @Override
    public BankDTO getBankById(String bankId) {
        long start = System.currentTimeMillis();

        GetBankRequest request = GetBankRequest.builder()
                .bankId(Long.valueOf(bankId))
                .build();

        GetBankResponse bankResponse = bankManagementService.getBankById(request);

        return BankDTO.builder()
                .id(bankResponse.getId())
                .bankCode(bankResponse.getBankCode())
                .bankName(bankResponse.getBankName())
                .bankShortName(bankResponse.getBankShortName())
                .swiftCode(bankResponse.getSwiftCode())
                .ordering(Integer.valueOf(bankResponse.getOrdering()))
                .createdAt(bankResponse.getCreatedAt())
                .createdBy(bankResponse.getCreatedBy())
                .updatedAt(bankResponse.getUpdatedAt())
                .updatedBy(bankResponse.getUpdatedBy())
                .build();
    }

}
