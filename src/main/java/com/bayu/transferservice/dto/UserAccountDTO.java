package com.bayu.transferservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountDTO implements Serializable {

    private static final long serialVersionUID = 1396067897203215363L;

    private String accountNumber;

    private String accountStatus;

    private String accountType;

    private String productName;

    private String productType;

    private String productCode;

    private String currency;

    private String cardNumber;

    private String cardStatus;

    private Integer ordering;

    private Boolean isVisible;

    private Boolean isSof;

    private String additionalData;

    private String accountAlias;

    private BigDecimal balance;

    private Boolean isPrimary;

    private String accountOwnerName;

    private String accountLinking;



}
