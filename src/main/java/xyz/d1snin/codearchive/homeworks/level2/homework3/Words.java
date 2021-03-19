package xyz.d1snin.codearchive.homeworks.level2.homework3;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Pie");
        words.add("Apple");
        words.add("Banana");
        words.add("Banana");
        words.add("Apple");
        words.add("Strawberry");
        words.add("Orange");
        words.add("Orange");
        words.add("Apricot");
        words.add("Peach");
        words.add("Peach");
        System.out.println("Initial array: " + words);
        System.out.println("No duplicates: " + removeDuplicates((ArrayList<?>) words));
        countsAll((ArrayList<String>) words);
    }
    private static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> newList = new ArrayList<>();
        for (T element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
    private static void countsAll(ArrayList<String> list) {
        Set<String> set = new HashSet<>(list);
        for (String r : set) {
            if (Collections.frequency(list, r) > 1) {
                System.out.println(r + ": " + Collections.frequency(list, r));
            }
        }
    }
}
