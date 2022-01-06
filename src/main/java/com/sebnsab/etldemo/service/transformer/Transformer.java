package com.sebnsab.etldemo.service.transformer;

public interface Transformer<S, TD> {
    TD transform(S source);
}
