package com.javarush.task.task14.task1408;

public abstract class Hen implements Country{
    String country;
    abstract int getCountOffEggsPerMonth();
    String getDescription(){
        return "Я - курица.";
    }
}
