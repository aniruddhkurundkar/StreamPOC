package com.stream.method.poc;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * find the first non-repeated character in it using Stream functions
 */

public class FindFirstNonRepeatedCharacterUsingStream {
    public static void main(String[] args){
        String str = "Java Hungry Blog Alive is Awesome";
        Character result = str.chars()// Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))// First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);
    }
}
