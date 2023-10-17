package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while (reader.ready()) {
                String line = reader.readLine();
                String[] lineSplit = line.split(" ");
                int countWord = 0;
                for (String str1 : words) {
                    for (String str2 : lineSplit) {
                        if (str1.equals(str2)) {
                            countWord++;
                        }
                    }
                }
                if (countWord == 2) {
                    System.out.println(line);
                }
            }
        }

    }
}
