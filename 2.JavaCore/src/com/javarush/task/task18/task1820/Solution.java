package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = fileName.readLine();
        String secondFile = fileName.readLine();
        List<Double> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(firstFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(secondFile))) {
            while (reader.ready()) {
                String[] doubles = reader.readLine().split(" ");
                for (String str : doubles) {
                    list.add(Double.parseDouble(str));
                }
            }
            for (Double num : list) {
                writer.write(String.valueOf(Math.round(num)));
                writer.newLine();
            }

        }
    }
}
