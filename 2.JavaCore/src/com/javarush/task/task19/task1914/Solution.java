package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream original = System.out;
        ByteArrayOutputStream newStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(newStream);
        System.setOut(newPrintStream);

        testString.printSomething();
        String[] equation = newStream.toString().replaceAll("=", "").trim().split(" ");
        int a = Integer.parseInt(equation[0]);
        int b = Integer.parseInt(equation[2]);
        int c = equation[1].equals("+") ? a + b : equation[1].equals("*") ? a * b : a - b;

        System.setOut(original);
        System.out.printf("%d %s %d = %d", a, equation[1], b, c);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

