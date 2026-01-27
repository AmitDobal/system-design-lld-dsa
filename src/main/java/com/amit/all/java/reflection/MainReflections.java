package com.amit.all.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflections {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Billi", 2, 1);
        Class<? extends Cat> clazz = myCat.getClass();

        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            if (field.getName().equals("name")){
                field.setAccessible(true);
                field.set(myCat, "Tom");
            }
        }

        Method[] declaredMethod = clazz.getDeclaredMethods();
        for (Method method : declaredMethod){
            if(method.getName().equals("speak")){
                method.setAccessible(true);
                method.invoke(myCat);
            }
        }

        System.out.println(myCat.getName());
        System.out.println(myCat);


    }
}
