package com.sebnsab.etldemo.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter @Setter
public class Transaction {

    private Long id;
    private Long portfolioId;
    private Date transactionDate;
    private Long security;
    private BigDecimal marketPrice;
    private Long units;

}
