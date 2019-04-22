package com.sustav.devtool.entity;

import lombok.Data;

@Data
public class Disc extends Product {

    private boolean capacity;

    public Disc(String name, double price) {
        super(name, price);
    }
}
