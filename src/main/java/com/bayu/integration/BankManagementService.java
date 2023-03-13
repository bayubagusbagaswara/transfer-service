package com.bayu.integration;

import com.bayu.bankmanagementservice.dto.bank.GetBankRequest;
import com.bayu.bankmanagementservice.dto.bank.GetBankResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Errornya karena BankManagementService tidak bisa dijadikan Bean
 */
@Slf4j
@Service
@Component
public class BankManagementService {

    @Value("${url.getBankById}")
    private String getBankByIdUrl;

    @Autowired
    RestTemplate restTemplate;

    public GetBankResponse getBankById(GetBankRequest request) {
        try {
            log.info("Get Bank By ID");
            return  restTemplate.postForEntity(getBankByIdUrl, request, GetBankResponse.class).getBody();
        } catch (Exception e) {
            log.error("Error get Bank By Id : " + e.getMessage(), e);
            throw e;
        }
    }
}
