package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
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
        try (FileReader reader = new FileReader(firstFileName);
        FileWriter writer = new FileWriter(secondFileName)) {
            int count = 1;
            while (reader.ready()) {
                int symbol = reader.read();
                if (count % 2 == 0) {
                    writer.write(symbol);
                }
                count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
