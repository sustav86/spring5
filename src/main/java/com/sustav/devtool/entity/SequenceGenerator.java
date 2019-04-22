package com.sustav.devtool.entity;

import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

@Data
public class SequenceGenerator {

    private String prefix;
    private String suffix;
    private int initial;
    private final AtomicInteger counter = new AtomicInteger();

    public String getSequence() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(prefix)
                .append(initial)
                .append(counter.getAndIncrement())
                .append(suffix);

        return stringBuilder.toString();
    }
}
