package com.test.solid;

public class Clock extends Calendar{

   private Calendar today;

    public Clock() {
    }

    public Clock(Calendar today) {
        this.today = today;

    }

    public static void main(String[] args) {

        Clock montana = new Clock(new Calendar());

        montana.today.data();
        montana.timer(10);


    }

    void timer(int t) {

        for (int i = t; i >= 0; i--) {
            System.out.print("->" + i );
        }
    }


    public Calendar getToday() {
        return today;
    }

    public void setToday(Calendar today) {
        this.today = today;
    }
}
