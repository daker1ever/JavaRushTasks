package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution {
    static String firstFileName;
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int countOfWordWorld = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(firstFileName))) {
            while (reader.ready()) {
                String[] line = reader.readLine().split("\\p{Punct}\\s");
                for (String str : line) {
                    if (str.trim().equalsIgnoreCase("world")) {
                        countOfWordWorld++;
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(countOfWordWorld);
    }
}
