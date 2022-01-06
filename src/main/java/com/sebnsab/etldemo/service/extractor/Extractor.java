package com.sebnsab.etldemo.service.extractor;

public interface Extractor<S, ED> {
    ED extract(S source);
}
