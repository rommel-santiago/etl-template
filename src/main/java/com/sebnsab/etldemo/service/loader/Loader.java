package com.sebnsab.etldemo.service.loader;

public interface Loader<S> {
    void load(S source);
}
