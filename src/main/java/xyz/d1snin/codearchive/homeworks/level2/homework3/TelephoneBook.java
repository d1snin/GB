package xyz.d1snin.codearchive.homeworks.level2.homework3;

import java.util.*;

public class TelephoneBook {
    static Map<String, List<String>> book = new TreeMap<>();

    public static void main(String[] args) {
        add("Fedot", "+79898772834");
        add("Fedot", "+31289");
        add("Alex", "+44132141243123");
        add("Alex", "+42938749823");
        add("Dmitry", "+48736864273");
        getBook();
        try {
            System.out.println(get("Alex"));
            System.out.println(get("DAwdwa"));
        } catch (CantFindException cantFindException) {
            cantFindException.printStackTrace();
        }
    }

    private static void add(String name, String number) {
        if (book.containsKey(name)) {
            book.get(name).add(number);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(number);
            book.put(name, phones);
        }
    }

    private static String get(String name) throws CantFindException {
        if (book.containsKey(name)) {
            return book.get(name).toString().replace("[", "").replace("]", "");
        }
        throw new CantFindException();
    }

    private static void getBook() {
        for (Map.Entry<String, List<String>> entry : book.entrySet()) {
            System.out.println(entry.getKey() + " / " + entry.getValue().toString().replace("[", "").replace("]", ""));
        }
    }
}