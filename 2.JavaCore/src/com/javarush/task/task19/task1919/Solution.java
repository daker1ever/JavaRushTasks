package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> result = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] splitLine = line.split(" ");
                if (result.containsKey(splitLine[0])) {
                    result.put(splitLine[0], result.get(splitLine[0]) + Double.parseDouble(splitLine[1]));
                } else {
                    result.put(splitLine[0], Double.parseDouble(splitLine[1]));
                }
            }
            for (String str : result.keySet()) {
                System.out.println(str + " " + result.get(str));
            }
        }
    }
}
