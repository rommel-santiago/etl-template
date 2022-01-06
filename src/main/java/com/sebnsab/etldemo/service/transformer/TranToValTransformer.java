package com.sebnsab.etldemo.service.transformer;

import com.sebnsab.etldemo.model.FXRate;
import com.sebnsab.etldemo.model.Parameter;
import com.sebnsab.etldemo.model.Transaction;
import com.sebnsab.etldemo.model.Valuation;
import com.sebnsab.etldemo.service.extractor.Extractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TranToValTransformer")
public class TranToValTransformer implements Transformer<Parameter, List<Valuation>> {

    @Autowired @Qualifier("transactionExtractor")
    private Extractor<Parameter, List<Transaction>> transactionExtractor;

    @Autowired @Qualifier("fxRateExtractor")
    private Extractor<Parameter, List<FXRate>> fxRateExtractor;

    @Override
    public List<Valuation> transform(Parameter source) {
        return null;
    }
}
