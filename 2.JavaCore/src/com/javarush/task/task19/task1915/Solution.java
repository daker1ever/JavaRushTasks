package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        PrintStream original = System.out;
        ByteArrayOutputStream newStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(newStream);
        System.setOut(newPrintStream);

        testString.printSomething();
        String result = newStream.toString();
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(result.getBytes());
        }

        System.setOut(original);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

