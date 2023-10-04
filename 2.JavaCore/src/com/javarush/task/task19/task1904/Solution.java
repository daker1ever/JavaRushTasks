package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String[] person = fileScanner.nextLine().split(" ");
            int day = Integer.parseInt(person[3]);
            int month = Integer.parseInt(person[4]);
            int year = Integer.parseInt(person[5]);
            Calendar calendar = new GregorianCalendar(year, month-1, day);
            Date birthDate = calendar.getTime();
            return new Person(person[1], person[2], person[0], birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
