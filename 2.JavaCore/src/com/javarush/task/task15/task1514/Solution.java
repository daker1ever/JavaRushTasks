package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static
    {
        labels.put(1.0,"odin");
        labels.put(2.0,"dva");
        labels.put(3.0,"tri");
        labels.put(4.0,"chetire");
        labels.put(5.0,"pyat'");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
