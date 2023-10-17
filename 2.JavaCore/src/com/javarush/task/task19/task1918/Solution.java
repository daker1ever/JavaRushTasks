package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            while (fileReader.ready()) {
                sb.append(fileReader.readLine());
            }
            String line = sb.toString().replaceAll("\\n", " ");
            String tagOpen = args[0];
            String tagClose = "/"+tagOpen;
            for (int i = line.indexOf(tagOpen) - 1; i < line.length(); i++) {
                int indexOpen = i;
                int indexClose = line.indexOf(tagClose, indexOpen + 1) + tagClose.length() + 1;

                int checkOpen = line.indexOf(tagOpen, indexClose + 1);
                int checkClose = line.indexOf(tagClose, indexClose + 1);

                if (checkClose < checkOpen) {
                    indexClose = checkClose + tagClose.length() + 1;
                    System.out.println(line.substring(indexOpen, indexClose));
                } else {
                    System.out.println(line.substring(indexOpen, indexClose));
                }
                i = indexClose - 1;
            }
        }

    }
}
