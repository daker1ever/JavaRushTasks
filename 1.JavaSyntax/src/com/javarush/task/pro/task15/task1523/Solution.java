package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        //напишите тут ваш код
        URLConnection connection = url.openConnection();
        Scanner scanner = new Scanner(System.in);
        connection.setDoOutput(true);

        try (PrintStream output = new PrintStream(connection.getOutputStream())) {
            output.println(scanner.next());
        } catch (Exception ignore) {}

        try (BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            while (input.ready()) {
                System.out.println(input.readLine());
            }
        } catch (Exception ignore) {}
    }
}

