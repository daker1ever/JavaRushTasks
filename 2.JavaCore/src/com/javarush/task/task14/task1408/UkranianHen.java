package com.javarush.task.task14.task1408;

public class UkranianHen extends Hen{
    public UkranianHen() {
        this.country = Country.UKRAINE;
    }
    public String getCountry(){
        return this.country;
    }

    @Override
    public int getCountOffEggsPerMonth() {
        return 90;
    }
    public String getDescription(){
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", this.getCountry(), this.getCountOffEggsPerMonth());
    }
}
