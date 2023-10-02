package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        ArrayList<Integer> list = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                list.add(fileInputStream.read());
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            int first = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                int second = list.get(j);
                if (second == first) {
                    list.remove(j);
                    j--;
                } else {
                    break;
                }
            }
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
