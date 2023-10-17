package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        String firstFileName;
        String secondFileName;
        List<String> file1 = new ArrayList<>();
        List<String> file2 = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        }
        try (BufferedReader reader1 = new BufferedReader(new FileReader(firstFileName));
             BufferedReader reader2 = new BufferedReader(new FileReader(secondFileName))) {
            while (reader2.ready()) {
                file2.add(reader2.readLine());
            }
            int numOfString = 0;
            while (reader1.ready()) {
                String str = reader1.readLine();
                if (str.equals(file2.get(numOfString))) {
                    lines.add(new LineItem(Type.SAME, str));
                } else if (numOfString < file2.size() - 1) {
                    if (str.equals(file2.get(numOfString + 1))) {
                        lines.add(new LineItem(Type.ADDED, file2.get(numOfString)));
                    } else {
                        lines.add(new LineItem(Type.REMOVED, str));
                    }
                } else {
                    lines.add(new LineItem(Type.REMOVED, str));
                }
                numOfString++;
            }
            System.out.println(lines);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
