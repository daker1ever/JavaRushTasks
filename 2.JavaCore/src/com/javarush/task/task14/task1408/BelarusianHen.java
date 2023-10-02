package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{
    public BelarusianHen() {
        this.country = Country.BELARUS;
    }
    public String getCountry(){
        return this.country;
    }

    @Override
    public int getCountOffEggsPerMonth() {
        return 100;
    }
    public String getDescription(){
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", this.getCountry(), this.getCountOffEggsPerMonth());
    }
}
