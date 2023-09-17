package com.stream.method.poc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareListOfIntegersUsingStream {
    public static void main(String[] arg){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> newList = list.stream().map(number -> number*number).collect(Collectors.toList());
        newList.stream().forEach(System.out::println);
        
    }
}
