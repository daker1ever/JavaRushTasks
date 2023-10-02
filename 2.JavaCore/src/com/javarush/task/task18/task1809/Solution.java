package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile1 = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile1)){
            byte[] buffer = new byte[fileInputStream.available()];
            while (fileInputStream.available() > 0) {
                int count = fileInputStream.read(buffer);
            }
            for (int i = buffer.length - 1; i >= 0; i--) {
                fileOutputStream.write(buffer[i]);
            }
        }
    }
}
