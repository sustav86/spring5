package com.sustav.devtool.entity;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class CustomPrefixGenerator implements PrefixGenerator {
    @Override
    public String getPrefix() {
        DateFormat formatter = new SimpleDateFormat("MMdd");
        return formatter.format(new Date());
    }
}
