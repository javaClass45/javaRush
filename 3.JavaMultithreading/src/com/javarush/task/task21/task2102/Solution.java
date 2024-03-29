package com.javarush.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* 
Сравниваем модификаторы
*/

public class Solution {
    public static void main(String[] args) {
        int classModifiers = Solution.class.getModifiers();
        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        int methodModifiers = getMainMethod().getModifiers();
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        if (Modifier.isAbstract(allModifiers) && Modifier.isAbstract(specificModifier))
            return true;

        if (Modifier.isFinal(allModifiers) && Modifier.isFinal(specificModifier))
            return true;

        if (Modifier.isInterface(allModifiers) && Modifier.isInterface(specificModifier))
            return true;

        if (Modifier.isNative(allModifiers) && Modifier.isNative(specificModifier))
            return true;

        if (Modifier.isPrivate(allModifiers) && Modifier.isPrivate(specificModifier))
            return true;

        if (Modifier.isProtected(allModifiers) && Modifier.isProtected(specificModifier))
            return true;

        if (Modifier.isPublic(allModifiers) && Modifier.isPublic(specificModifier))
            return true;

        if (Modifier.isStatic(allModifiers) && Modifier.isStatic(specificModifier))
            return true;

        if (Modifier.isStrict(allModifiers) && Modifier.isStrict(specificModifier))
            return true;

        if (Modifier.isSynchronized(allModifiers) && Modifier.isSynchronized(specificModifier))
            return true;

        if (Modifier.isTransient(allModifiers) && Modifier.isTransient(specificModifier))
            return true;

        return Modifier.isVolatile(allModifiers) && Modifier.isVolatile(specificModifier);

    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
