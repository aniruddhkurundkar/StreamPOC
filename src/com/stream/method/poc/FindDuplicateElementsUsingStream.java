package com.stream.method.poc;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * find duplicate elements in a given
 * integers list in java using Stream functions
 */
public class FindDuplicateElementsUsingStream {

    public static void main(String[] args){
        System.out.println("Printing unique elements.");

        List<Integer> myList = Arrays.asList(12,3,4,35,6,17,3,14,6);
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(n->!set.add(n)).forEach(System.out::println);

        System.out.println("Printing Repeated words with their count.");

        String strSentence = "INDIA is my country. India has 30 states. InDia is world's 3 largest economy.";
        List<String> list = new ArrayList<>(Arrays.asList(strSentence.split(" ")));
        Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(s -> s.toUpperCase(),Collectors.counting()));
        map.entrySet().stream().filter(m->m.getValue()>1).forEach(System.out::println);

        System.out.println("Printing all the characters from the given string with their count.");

        String str = "Aniruddh Ashok Kurundkar";
        Arrays.stream(str.toLowerCase().split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream().forEach(System.out::println);
    }
}
