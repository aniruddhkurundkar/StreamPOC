package com.stream.method.poc;

import java.util.Arrays;
import java.util.List;

public class FindOddNumberUsingStream {
    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(12,3,4,5,6,7,13,14,56);
        myList.stream().filter(n->n%2==1).forEach(System.out::println);
    }
}
