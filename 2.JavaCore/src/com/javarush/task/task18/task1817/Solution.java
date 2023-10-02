package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {
        if (args[0] == null) {
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            int allCharCount = 0;
            int spacesCount = 0;
            Pattern pattern = Pattern.compile(" ");

            while (reader.ready()) {
                String str = reader.readLine();
                allCharCount += str.length();
                Matcher matcher = pattern.matcher(str);
                while (matcher.find()) {
                    spacesCount++;
                }
            }
            double result = (double) spacesCount / allCharCount * 100;

            System.out.printf("%.2f", result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
