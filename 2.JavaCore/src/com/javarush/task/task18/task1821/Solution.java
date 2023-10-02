package com.javarush.task.task18.task1821;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        if (args[0] == null) {
            return;
        }
        Map<Character, Integer> map = new HashMap<>();
        try (FileReader reader = new FileReader(args[0])){
            char[] charArray = new char[256];
            int count;
            while (reader.ready()) {
                reader.read(charArray);
                for (char c : charArray) {
                    if (map.containsKey(c)) {
                        count = map.get(c);
                        map.put(c, ++count);
                    } else {
                        map.put(c, 1);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        TreeMap<Character, Integer> map2 = new TreeMap<>(map);
        for (Character c : map2.keySet()) {
            System.out.println(c + " " + map2.get(c));
        }

    }
}
