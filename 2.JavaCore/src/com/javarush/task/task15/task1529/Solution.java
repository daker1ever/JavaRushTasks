package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            String type = br.readLine();
            if (type.equals("helicopter")) {
                result = new Helicopter();
            } else if (type.equals("plane")) {
                int pass = Integer.parseInt(br.readLine());
                result = new Plane(pass);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
