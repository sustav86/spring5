package com.sustav.devtool.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Battery extends Product {

    private boolean rechargeable;

    public Battery(String name, double price, boolean rechargeable) {
        super(name, price);
        this.rechargeable = rechargeable;
    }

    public Battery(String name, double price) {
        super();
    }
}
