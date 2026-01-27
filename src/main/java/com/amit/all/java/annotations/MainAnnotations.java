package com.amit.all.java.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainAnnotations {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Person person = new Employee("John", 20, 20000, Department.BA);
        Class<? extends Person> clazz = person.getClass();
        for(Method method : clazz.getDeclaredMethods()){
            if (method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately runImmediately = method.getAnnotation(RunImmediately.class);

                for(int i = 0; i < runImmediately.times(); i++){
                    method.invoke(person);
                }
            }
        }

    }
}
