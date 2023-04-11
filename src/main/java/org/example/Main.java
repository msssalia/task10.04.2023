package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Task 1
        Character[] chars = {'a', 'b', 'c', 'd', 'd', 'e', 'e', 'e', 'f', 'f', 'a', 'z', 'r', 'r', 't', 't', 'a'};
        List<Character> charsAsCollection = Arrays.asList(chars);
        Map<Character, Integer> charsInMap = new TreeMap<>();
        for (char i: charsAsCollection) {
            if(charsInMap.containsKey(i)) {
                charsInMap.put(i, (charsInMap.get(i) + 1));
            } else {
                charsInMap.put(i, 1);
            }
        }
        System.out.println(charsInMap);


//        Task 2
        Object[] objects = {2, 4, 2, 1, "b", 3, "c", "b", 1, "d", "d", "c", "a"};
        ArrayList<Object> withDuplicates = new ArrayList<>(Arrays.asList(objects));
        TreeSet<Object> withoutDuplicates = new TreeSet<>(new MyComparator());
        withoutDuplicates.addAll(withDuplicates);
        System.out.println(withoutDuplicates);
    }
}