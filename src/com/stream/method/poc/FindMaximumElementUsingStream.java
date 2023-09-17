package com.stream.method.poc;

import java.util.Arrays;
import java.util.List;

/**
 * find the maximum value element present in it using Stream functions
 */
public class FindMaximumElementUsingStream {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(3,2,4,8,6,7,45,34,65,24);
        int max = list.stream().max(Integer::compare).get();
        System.out.println(max);
    }

}
