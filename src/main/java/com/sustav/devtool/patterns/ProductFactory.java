package com.sustav.devtool.patterns;

import com.sustav.devtool.entity.Battery;
import com.sustav.devtool.entity.Disc;
import com.sustav.devtool.entity.Product;

public class ProductFactory {

    public static Product productCreate(String name) {

        if ("aaa".equals(name)) {
            return new Battery("battary", 23, true);
        }else if ("disk".equals(name)) {
            return new Disc("disk", 45);
        }

        throw new IllegalArgumentException("not found");
    }
}
