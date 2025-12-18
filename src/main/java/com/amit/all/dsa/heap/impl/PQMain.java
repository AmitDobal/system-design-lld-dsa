package com.amit.all.dsa.heap.impl;

import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Supplier;

public class PQMain {
    public static void main(String[] args) {
        List<Student> students = studentSupplier.get();
        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> a.getMarks() - b.getMarks());
        pq.addAll(students);

        System.out.println(students);
        int size = pq.size();
        for(int i = 0; i < size; i++){
            System.out.println(pq.poll());
        }
    }



     private static final Supplier<List<Student>> studentSupplier = () -> List.of(new Student("Amit", 75),
            new Student("Sumit", 49),
            new Student("Akshay", 90),
            new Student("Raj", 28),
            new Student("Ram", 59));

    static class Student {
        private String name;
        private int marks;

        public Student(String name, int marks){
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }
    }
}
