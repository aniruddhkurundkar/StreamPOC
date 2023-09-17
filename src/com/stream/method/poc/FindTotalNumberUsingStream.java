package com.stream.method.poc;

import java.util.Arrays;
import java.util.List;

/**
 * find the total number of elements present in the list using Stream functions
 */

public class FindTotalNumberUsingStream {
    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(3,2,5,6,7,4,1,8,69,14,3,5);
        long count = myList.stream().count();
        System.out.println(count);
    }
}
