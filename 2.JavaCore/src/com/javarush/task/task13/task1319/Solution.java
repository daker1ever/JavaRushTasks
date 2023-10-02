package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try (Scanner sc = new Scanner(System.in);
             FileWriter fw = new FileWriter(sc.nextLine());
             BufferedWriter br = new BufferedWriter(fw)) {
            while (true) {
                String toWrite = sc.nextLine();
                if(!toWrite.equals("exit")) {
                    br.write(toWrite + "\n");
                } else {
                    br.write(toWrite);
                }
                if (toWrite.equals("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
