package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream original = System.out;
        ByteArrayOutputStream newStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(newStream);
        System.setOut(newPrintStream);
        testString.printSomething();
        String result = newStream.toString().replace("te", "??");
        System.setOut(original);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
