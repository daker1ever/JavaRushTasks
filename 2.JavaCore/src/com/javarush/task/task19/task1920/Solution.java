package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] line = reader.readLine().split(" ");
                String name = line[0];
                Double value = Double.parseDouble(line[1]);
                if (map.containsKey(name)) {
                    map.put(name, map.get(name) + value);
                } else {
                    map.put(name, value);
                }
            }
            Double biggestValue = 0.0;
            for (String str : map.keySet()) {
                if (map.get(str) > biggestValue) {
                    biggestValue = map.get(str);
                }
            }

            for (String str : map.keySet()) {
                if (map.get(str).equals(biggestValue)) {
                    System.out.println(str);
                }
            }
        }
    }
}
