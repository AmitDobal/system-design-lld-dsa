package com.amit.all.java.reflection;

import java.util.Objects;

public class Cat {

    private final String name;
    private int age;
    public int count;

    public Cat(String name, int age, int count) {
        this.name = name;
        this.age = age;
        this.count = count;
    }

    private void speak(){
        System.out.println("Meow");
    }



    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && count == cat.count && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, count);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", count=" + count +
                '}';
    }
}
