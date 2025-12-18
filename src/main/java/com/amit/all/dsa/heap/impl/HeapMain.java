package com.amit.all.dsa.heap.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class HeapMain {
    public static void main(String[] args) {
        /**
         * Conditions for heap
         *  1. Complete Binary Tree (Every nodes should have two children,
         *      and last level node can have 1, 2 or none) and starts with left.
         *  2. Satisfies Heap properties
         */
//        List<Integer> list = List.of(20,14,30,23,15,13);
//        System.out.println(list);
//
//        Heap heap = new Heap();
//        list.forEach(heap::insert);
//        System.out.println(heap.list);
//
//
//        var res = heap.heapify(list);
//        System.out.println(res);

            HeapMain h = new HeapMain();
            int[][] a = {{2,4},{1,2},{3,2},{4,1}};
            h.getOrder(a);

    }


    public int[] getOrder(int[][] tasks) {
        //1. sort with enqueueTime
        //2. use min heap using processing time
        List<Task> taskList = new ArrayList<>();
        for(int i = 0; i < tasks.length; i++){
            taskList.add(new Task(tasks[i][0], tasks[i][1], i));
        }
        System.out.println(taskList);

        taskList.sort((a, b) -> Integer.compare(a.enqueueTime, b.enqueueTime));

        System.out.println(taskList);

        int idx = 0;
        PriorityQueue<Task> pq = new PriorityQueue<>(Comparator.comparingInt(t -> t.processingTime));


        return new int[1];
    }

}

class Task {
    int enqueueTime;
    int processingTime;
    int index;

    public Task(int enqueueTime, int processingTime, int index) {
        this.enqueueTime = enqueueTime;
        this.processingTime = processingTime;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Task{" +
                "enqueueTime=" + enqueueTime +
                ", processingTime=" + processingTime +
                ", index=" + index +
                '}';
    }
}
