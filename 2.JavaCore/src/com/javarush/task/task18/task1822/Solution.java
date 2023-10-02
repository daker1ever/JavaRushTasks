package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                if (product.id == Integer.parseInt(args[0])) {
                    System.out.println(product);
                    break;
                }
            }
        }
    }
    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%d %s%s %s", id, name, price, quantity);
        }
    }

    public static Product getProduct(String string) {
        String[] split = string.split(" ");
        String id = split[0];
        String name = "";
        for (int i = 1; i < split.length - 2; i++) {
            name += split[i] + " ";
        }

        String price = split[split.length - 2];
        String quantity = split[split.length - 1];
        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}
