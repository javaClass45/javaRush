package com.test.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class s = int.class;
        System.out.println(s);

        String name = s.getName();
        System.out.println(name);

        Class cs = Class.forName("java.lang.String");
        System.out.println(cs);

        Object o1 = String.valueOf(1);
        Object o2 = 123 + "T";
        System.out.println(o1.getClass() == o2.getClass());


        Class[] interfaces = List.class.getInterfaces();
        for (Class i:interfaces) {
        System.out.println("List interfaces = " + i);
        }


        Class parent = String.class.getSuperclass();
        System.out.println("String.class.parent = " + parent);

        Method[] methods = List.class.getMethods();
        System.out.println("List.methods = " + methods.toString());

        String sc = String.class.newInstance();



        String ss = String.class.newInstance();
        Method m = String.class.getMethod("length");
        int length = (int) m.invoke(ss);
        System.out.println("Получаем метод length у класса String, вызываем его у строки ss: " + length);




    }

}
