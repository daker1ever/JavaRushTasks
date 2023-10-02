package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.NotActiveException;
import java.io.NotSerializableException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        exceptions.add(new NullPointerException());
        exceptions.add(new NegativeArraySizeException());
        exceptions.add(new IOException());
        exceptions.add(new NoSuchElementException());
        exceptions.add(new NoSuchFieldException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new NoSuchMethodException());
        exceptions.add(new NotActiveException());
        exceptions.add(new NotSerializableException());

    }
}
