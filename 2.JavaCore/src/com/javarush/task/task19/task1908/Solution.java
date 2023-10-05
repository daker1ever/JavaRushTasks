package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    static String firstFileName;
    static String secondFileName;
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(firstFileName));
        BufferedWriter writer = new BufferedWriter(new FileWriter(secondFileName))) {
            while (reader.ready()) {
                String[] line = reader.readLine().split(" ");
                for (String str : line) {
                    try {
                        Integer.parseInt(str);
                        writer.write(str + " ");
                    } catch (NumberFormatException e) {

                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
