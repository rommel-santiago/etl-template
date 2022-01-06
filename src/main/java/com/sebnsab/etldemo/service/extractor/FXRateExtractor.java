package com.sebnsab.etldemo.service.extractor;

import com.sebnsab.etldemo.model.FXRate;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service("FXRateExtractor")
public class FXRateExtractor implements Extractor<File, List<FXRate>> {

    @Override
    public List<FXRate> extract(File source) {
        return null;
    }
}
