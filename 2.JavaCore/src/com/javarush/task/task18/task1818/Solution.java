package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    static String firstFile;
    static String secondFile;
    static String thirdFile;

    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        firstFile = fileName.readLine();
        secondFile = fileName.readLine();
        thirdFile = fileName.readLine();
        try (BufferedWriter writer1 = new BufferedWriter(new FileWriter(firstFile));
             BufferedReader reader2 = new BufferedReader(new FileReader(secondFile));
             BufferedReader reader3 = new BufferedReader(new FileReader(thirdFile))) {
            while (reader2.ready()) {
                String str = reader2.readLine();
                writer1.write(str + "\n");
            }
            while (reader3.ready()) {
                String str = reader3.readLine();
                writer1.write(str + "\n");
            }
        }
    }
}
