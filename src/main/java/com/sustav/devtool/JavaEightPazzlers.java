package com.sustav.devtool;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaEightPazzlers {

    public static void main(String[] args) {
        List<String> objects = new ArrayList<>();
//        objects.add("хлеб");
//        objects.add("молоко");
//        objects.add("колбаса");
//        objects.subList(0, 2);
//        Stream<String> stream = objects.stream();
//        objects.add("eags");
//        stream.forEach(System.out::println);

//        System.out.println(Stream.of(-1, 3, 5, 6, 7,0).max(Comparator.naturalOrder()).get());
//        Math.max(1, 7);
//        Optional<Integer> max = Stream.of(-1, 3, 5, 6, 7, 0).max(Comparator.naturalOrder());
//        Optional<Integer> max1 = Stream.of(-1, 3, 5, 6, 7, 0).max(Math::max);

//        Map<String, String> oldSchool = new HashMap<String, String>() {{
//            put("buildTool", "maven");
//            put("lang", "java");
//            put("IoC", "jee");
//        }};
//
//        Map<String, String> proper = new HashMap<String, String>() {{
//            put("buildTool", "gradle");
//            put("lang", "groovy");
//            put("IoC", "spring");
//        }};
//
//        oldSchool.replaceAll(proper::put);
//        oldSchool.replaceAll(new BiFunction<String, String, String>() {
//            @Override
//            public String apply(String s, String s2) {
//                return null;
//            }
//        });


        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "third"));
        list.stream().forEach(x -> {
            if (x.equals("two")) {
                list.remove(x);
            }
        });

    }
}
