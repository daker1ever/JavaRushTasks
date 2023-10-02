package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fis = new FileInputStream(new File(scanner.nextLine()));
        int minByte = Integer.MAX_VALUE;
        while (fis.available() > 0) {
            int temp = fis.read();
            if (temp < minByte) {
                minByte = temp;
            }
        }
        fis.close();
        System.out.println(minByte);
    }
}
