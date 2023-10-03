package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String fileName = reader1.readLine();
                try (BufferedReader reader2 = new BufferedReader(new FileReader(fileName))) {

                } catch (FileNotFoundException e) {
                    System.out.println(fileName);
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
