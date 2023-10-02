package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        String[] str = url.substring(url.indexOf("?") + 1).split("[&]");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("obj=")) {
                list.add(str[i].substring(str[i].indexOf("=") + 1));
            }
            if (str[i].contains("=")) {
                str[i] = str[i].substring(0, str[i].indexOf("="));
            }
            System.out.print(str[i] + " ");
        }
        System.out.println();
        if (list.size() != 0) {
            for (String s : list) {
                try { alert(Double.parseDouble(s));
                } catch (Exception e) {
                    alert(s);
                }
            }

        }
    }

        public static void alert ( double value){
            System.out.println("double: " + value);
        }

        public static void alert (String value){
            System.out.println("String: " + value);
        }
    }
