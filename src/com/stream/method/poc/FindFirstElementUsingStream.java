package com.stream.method.poc; /**
 * find the first element of the list using Stream function.
 */

import java.util.Arrays;
import java.util.List;
public class FindFirstElementUsingStream {
    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().findFirst().ifPresent(System.out::println);
    }
}
