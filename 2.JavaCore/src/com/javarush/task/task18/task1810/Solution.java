package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputFile = reader.readLine();

            try (FileInputStream fileInputStream = new FileInputStream(inputFile)){
                if (fileInputStream.available() < 1000) {
                    throw new DownloadException();
                }

            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
