package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = fileName.readLine();
        String secondFile = fileName.readLine();
        List<String> list = new ArrayList<>();
        try (BufferedReader reader1 = new BufferedReader(new FileReader(firstFile));
             BufferedReader reader2 = new BufferedReader(new FileReader(secondFile))){
            while (reader1.ready()) {
                list.add(reader1.readLine());
            }
            try (BufferedWriter writer1 = new BufferedWriter(new FileWriter(firstFile))) {
                while (reader2.ready()) {
                    writer1.write(reader2.readLine() + "\n");
                }
                for (String str : list) {
                    writer1.write(str + "\n");
                }
            }
        }

    }
}
