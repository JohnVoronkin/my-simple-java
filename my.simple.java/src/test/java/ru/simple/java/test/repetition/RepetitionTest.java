package ru.simple.java.test.repetition;

import java.util.HashMap;
import java.util.Map;

public class RepetitionTest {

    public static void main(String[] args) {

        //все элементы хранятся в парах
        Map<String, String> map = new HashMap<>();

        map.put("first", "Cat");
        map.put("second", "Dog");
        map.put("third", "Cheburashka");

        for (Map.Entry<String, String> pair : map.entrySet()) {

            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }


}