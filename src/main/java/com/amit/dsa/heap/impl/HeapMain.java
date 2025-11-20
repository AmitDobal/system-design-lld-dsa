package com.amit.dsa.heap.impl;

import java.util.List;

public class HeapMain {
    public static void main(String[] args) {
        /**
         * Conditions for heap
         *  1. Complete Binary Tree (Every nodes should have two children,
         *      and last level node can have 1, 2 or none) and starts with left.
         *  2. Satisfies Heap properties
         */
        List<Integer> list = List.of(20,14,30,23,15,13);
        System.out.println(list);

        Heap heap = new Heap();
        list.forEach(heap::insert);
        System.out.println(heap.list);


        var res = heap.heapify(list);
        System.out.println(res);


    }
}
