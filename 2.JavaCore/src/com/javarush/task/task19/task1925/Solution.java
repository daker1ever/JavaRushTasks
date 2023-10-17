package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                String[] line = reader.readLine().split(" ");
                for (String str : line) {
                    if (str.length() > 6) {
                        sb.append(str + ",");
                    }
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            writer.write(sb.toString());
        }
    }
}
