package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            while (!fileName.equals("exit")) {
                new Thread(new ReadThread(fileName)).start();
                fileName = reader.readLine();
            }
            System.out.println(resultMap);
        }

    }

    public static class ReadThread extends Thread {
        String fileName = "";
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (FileInputStream fis = new FileInputStream(fileName)) {
                int[] bytes = new int[1000];
                while (fis.available() > 0) {
                    bytes[fis.read()] += 1;
                }
                int neededByte = 0;
                int count = 0;
                for (int i = 0; i < bytes.length; i++) {
                    if (bytes[i] != 0 && bytes[i] > count) {
                        neededByte = i;
                    }
                }
                resultMap.put(fileName, neededByte);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
