package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        if (args[0] == null) {
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            int count =0;
            Pattern pattern = Pattern.compile("[a-zA-z]");

            while (reader.ready()) {
               String str = reader.readLine().toLowerCase();
                Matcher matcher = pattern.matcher(str);
                while (matcher.find()) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
