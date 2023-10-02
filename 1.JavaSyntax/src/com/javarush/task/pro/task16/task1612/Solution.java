package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезируем LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        //напишите тут ваш код
        Set<LocalDateTime> ldts = new HashSet<>();
        Set<LocalDate> lds = sourceMap.keySet();
        for (LocalDate ld : lds) {
            List<LocalTime> lt = sourceMap.get(ld);
            for (int i = 0; i < lt.size(); i++) {
                ldts.add(LocalDateTime.of(ld, lt.get(i)));
            }
        }
        return ldts;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}