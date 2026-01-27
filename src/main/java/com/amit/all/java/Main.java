package com.amit.all.java;


import com.amit.all.java.enums.Cereals;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String a = new String("A");
        String b = new String("A");

        System.out.println(a.intern() == b.intern());
        System.out.println(a == b);
    }
}
