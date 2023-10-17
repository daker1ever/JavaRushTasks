package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            while (reader.ready()) {
                String[] line = reader.readLine().split(" ");
                for (String str : line) {
                    for (Character c : str.toCharArray()) {
                        if (Character.isDigit(c)) {
                            writer.write(str + " ");
                            break;
                        }
                    }
                }
            }
        }
    }
}
