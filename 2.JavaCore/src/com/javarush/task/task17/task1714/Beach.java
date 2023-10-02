package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    synchronized public String getName() {
        return name;
    }

    synchronized public void setName(String name) {
        this.name = name;
    }

    synchronized public float getDistance() {
        return distance;
    }

    synchronized public void setDistance(float distance) {
        this.distance = distance;
    }

    synchronized public int getQuality() {
        return quality;
    }

    synchronized public void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }

    @Override
    public synchronized int compareTo(Beach obj) {
        int current = 0;
        int other = 0;
        float deltaDistance = distance - obj.getDistance();
        if(deltaDistance > 0) {
            other++;
        } else if(deltaDistance < 0) {
            current++;
        }
        int deltaQuality = quality - obj.getQuality();
        if(deltaQuality > 0) {
            current++;
        } else if(deltaQuality < 0) {
            other++;
        };
        return current - other;
    }
}
