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

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
     /* ---    проверка     ---     */
        Beach b1 = new Beach("a", 10000000, 1000);
        Beach b2 = new Beach("b", 100000000, 1000);
        System.out.println(b1.compareTo(b2));

    }

    @Override
    public synchronized int compareTo(Beach o) {
       //не оно  return (int)(o.getDistance()*o.getQuality()-this.distance*this.quality);
     // return (this.quality - o.getQuality()) + (int)(o.getDistance() - this.distance);
        int qualityDiff = Integer.compare(this.quality, o.quality);
        int distanceDiff = Float.compare(this.distance, o.distance);
        return Integer.compare(qualityDiff, distanceDiff);
    }
}
