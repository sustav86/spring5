package com.sustav.devtool.patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Decorator {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> decorated = Collections.checkedList(list, String.class);
        decorated.add("2");
        list.add("3");
        System.out.println(decorated);
    }
}
