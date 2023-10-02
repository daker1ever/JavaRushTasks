package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try (Scanner sc = new Scanner(System.in);
             FileInputStream fis = new FileInputStream(sc.nextLine());
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}