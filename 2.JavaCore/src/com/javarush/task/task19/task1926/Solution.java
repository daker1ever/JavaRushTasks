package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = console.readLine();
        }
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                System.out.println(sb.append(reader.readLine()).reverse());
                sb.delete(0, sb.length());
            }
        }
    }
}
