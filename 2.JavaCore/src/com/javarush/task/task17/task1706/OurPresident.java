package com.javarush.task.task17.task1706;

public class OurPresident {
    private static final OurPresident president;

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }

static  {
        synchronized (OurPresident.class){
            president = new OurPresident();

        }


}

}
