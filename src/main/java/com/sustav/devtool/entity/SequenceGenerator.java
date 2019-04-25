package com.sustav.devtool.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.concurrent.atomic.AtomicInteger;

@Data
public class SequenceGenerator {

    @Autowired
//    @Qualifier("customPrefixGenerator")
    private PrefixGenerator prefixGenerator;
    private String prefix;
    private String suffix;
    private int initial;
    private final AtomicInteger counter = new AtomicInteger();

    public String getSequence() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(prefixGenerator.getPrefix())
                .append(initial)
                .append(counter.getAndIncrement())
                .append(suffix);

        return stringBuilder.toString();
    }
}
