package com.javarush.task.task13.task1326;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try (FileInputStream fis = new FileInputStream(sc.nextLine());
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr)) {
            while (br.ready()) {
                Integer num = Integer.parseInt(br.readLine());
                if (num % 2 == 0) {
                    list.add(num);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(list);
        list.stream().forEach(System.out::println);
    }
}
