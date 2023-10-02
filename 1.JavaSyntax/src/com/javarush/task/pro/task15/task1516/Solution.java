package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                Path path = Path.of(scanner.nextLine());
                if (Files.isRegularFile(path)) {
                    System.out.printf("%s" + THIS_IS_FILE + "%n", path);
                } else if (Files.isDirectory(path)) {
                    System.out.printf("%s" + THIS_IS_DIR + "%n", path);
                } else if (!Files.isDirectory(path) && !Files.isRegularFile(path)) {
                    break;
                }
            } catch (Exception e) {
                break;
            }
        }
    }
}

