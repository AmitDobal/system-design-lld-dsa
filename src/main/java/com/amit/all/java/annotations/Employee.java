package com.amit.all.java.annotations;

public class Employee extends Person{

    private double salary;
    private Department department;

    @RunImmediately(times = 3)
    public String startWork(){
        System.out.println("Working.....");
        return "Working....";
    }

    public Employee(String name, int age, double salary, Department department) {
        super(name, age);
        this.department = department;
        this.salary = salary;
    }
}
