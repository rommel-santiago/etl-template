package com.sebnsab.etldemo.service.loader;

import com.sebnsab.etldemo.model.Parameter;
import com.sebnsab.etldemo.model.Valuation;
import com.sebnsab.etldemo.service.transformer.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class ValuationLoader implements Loader<Parameter> {

    @Autowired @Qualifier("tranToValTransformer")
    private Transformer<Parameter, List<Valuation>> valuationTransformer;

    @Override
    public void load(Parameter source) {
        List<Valuation> valuations = valuationTransformer.transform(source);


    }
}
