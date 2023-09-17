package com.stream.method.poc;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharacterUsingStream {
    public static void main(String[] args){
        String str = "Java Hungry 8 is Awesome";
        Character result = str.chars()// Stream of String
                .mapToObj(a->Character.toLowerCase(Character.valueOf((char)a)))// First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry->entry.getValue() == 1L)
                .map(entry->entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);
    }
}
