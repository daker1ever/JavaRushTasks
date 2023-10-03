package com.javarush.task.task18.task1827;

// import org.apache.commons.io.input.ReversedLinesFileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args[0].equals("-c")) {
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            scanner.close();
            /*try (ReversedLinesFileReader reader = new ReversedLinesFileReader(new File(fileName));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {

                String lastStringForId = reader.readLine();
                String ID = lastStringForId.substring(0, 8).trim();
                lastStringForId = null;

                int newID = Integer.parseInt(ID) + 1;
                StringBuilder newName = new StringBuilder();
                for (int i = 1; i < args.length - 2; i++) {
                    newName.append(args[i]).append(" ");
                }
                String newPrice = args[args.length - 2];
                String newQuantity = args[args.length - 1];
                writer.write(String.format("\n%-8d%-30.30s%-8.8s%-4.4s", newID, newName, newPrice, newQuantity));

            }*/
        }
    }
}
