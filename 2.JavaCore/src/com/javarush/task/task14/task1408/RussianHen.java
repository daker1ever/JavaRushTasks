package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{
    public RussianHen() {
        this.country = Country.RUSSIA;
    }
    public String getCountry(){
        return this.country;
    }

    @Override
    public int getCountOffEggsPerMonth() {
        return 110;
    }
    public String getDescription(){
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", this.getCountry(), this.getCountOffEggsPerMonth());
    }
}
