package com.thinkInJava.Chapter9;

public class FilterProcessor {
    public static void main(String[] args) {
        WaveForm w = new WaveForm();
    }
}

class FilterAdaptor implements Processor {
    Filter filter;

    public FilterAdaptor(Filter filter) {
        this.filter = filter;
    }

    //    @Override
    public String name() {
        return filter.name();
    }

    //    @Override
    public WaveForm process(Object input) {
        return filter.process((WaveForm) input);
    }
}
