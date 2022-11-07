package com.test.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClass {
    private int number;
    private String name = "defaultName";

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void setName(String name) {
        this.name = name;
    }

    private void printData() {
        System.out.println(number + name);
    }

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException {

        MyClass myClass = new MyClass();
        int number = myClass.getNumber();
        String name = null;

        System.out.println(number + name);

        Field field = myClass.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(myClass, "new value");
        name = (String) field.get(myClass);
        System.out.println(number + name);
        printData(myClass);

        //=====================================
        MyClass myClass1 = null;
        Class clazz = Class.forName(MyClass.class.getName());
        myClass1 = (MyClass) clazz.newInstance();
        System.out.println(" newInstance  " + myClass1);


    }


    public static void printData(Object myClass) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method method = myClass.getClass().getDeclaredMethod("printData");
        method.setAccessible(true);
        method.invoke(myClass);
    }


}
