package com.stream.method.poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringtoIntUsingMapMethod {

    public static void main(String[] a){
        List<String> list = new ArrayList<>();
        list = Arrays.asList("1","2","3","4");
        list.stream().map(Integer::valueOf).collect(Collectors.toList()).forEach(System.out::println);
        list.stream().mapToInt(num -> Integer.parseInt(num)).forEach(System.out::println);
    }
}
