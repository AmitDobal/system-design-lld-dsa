package com.amit.all.java.lambdas;


import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

//        int x = 10;
//
//        Runnable r = new Runnable() {
//            public void run() {
//                System.out.println(x);
//            }
//        };
//
//        x = 2;
//
//        int y = 10;
//
//        Runnable k = () -> System.out.println(y);
//
//        y = 2;

    }

    private static final Supplier<Double> getRandom = Math::random;

    private static <T> boolean check(T t, Predicate<T> a){
        return a.test(t);
    }
}
