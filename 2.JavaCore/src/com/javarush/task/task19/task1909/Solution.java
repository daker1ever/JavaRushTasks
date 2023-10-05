package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
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
                String line = reader.readLine();
                writer.write(line.replace(".", "!"));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
