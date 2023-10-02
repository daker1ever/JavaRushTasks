package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int nod = 0;

                /*while (true) {
                    if (num1 % nod == 0 && num2 % nod == 0) {
                        System.out.printf("Наибольший общий делитель для чисел %d и %d - %d", num1, num2, nod);
                        break;
                    }
                    nod--;
                }*/
                while (true) {
                    int a = num1;
                    int b = num2;
                    if (a > b) {
                        a = a - b;
                        if (a == 0) {
                            nod = b;
                            System.out.printf("Наибольший общий делитель для чисел %d и %d - %d", num1, num2, nod);
                            break;
                        }
                    } else if (a < b) {
                        b = b - a;
                        if (b == 0) {
                            nod = a;
                            System.out.printf("Наибольший общий делитель для чисел %d и %d - %d", num1, num2, nod);
                            break;
                        }
                    }
                }

        }
    }
}
