package com.sebnsab.etldemo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Parameter {

    private Long portfolioId;
    private Date fromDate;
    private Date toDate;

}
