package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    public MoldovanHen() {
        this.country = Country.MOLDOVA;
    }
    public String getCountry(){
        return this.country;
    }

    @Override
    public int getCountOffEggsPerMonth() {
        return 80;
    }
    public String getDescription(){
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", this.getCountry(), this.getCountOffEggsPerMonth());
    }
}
