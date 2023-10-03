package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            TreeMap<String, byte[]> map = new TreeMap<>();
            String newFileName = fileName.substring(0, fileName.lastIndexOf("."));
            while (!fileName.equals("end")) {
                String partNumber = fileName.substring(fileName.lastIndexOf("."));
                byte[] buffer;
                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName))) {
                    buffer = bis.readAllBytes();
                    map.put(partNumber, buffer);
                }
                fileName = reader.readLine();
            }
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFileName))){
                for (String key : map.keySet()) {
                    bos.write(map.get(key));
                }
            }
        }
    }
}
