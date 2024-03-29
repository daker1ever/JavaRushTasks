package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOffEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            switch (country) {
                case Country.RUSSIA : hen = new RussianHen();
                break;
                case Country.BELARUS : hen = new BelarusianHen();
                break;
                case Country.MOLDOVA : hen = new MoldovanHen();
                break;
                case Country.UKRAINE : hen = new UkranianHen();
                break;
                default : System.out.println("Нет таких куриц");
            }
            return hen;
        }
    }



}
