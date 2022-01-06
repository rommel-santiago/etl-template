package com.sebnsab.etldemo.service.extractor;

import com.sebnsab.etldemo.model.Parameter;
import com.sebnsab.etldemo.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TransactionExtractor")
public class TransactionExtractor implements Extractor<Parameter, List<Transaction>> {

    @Override
    public List<Transaction> extract(Parameter source) {
        return null;
    }
}
