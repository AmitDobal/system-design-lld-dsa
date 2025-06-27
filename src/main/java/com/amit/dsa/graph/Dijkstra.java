package com.amit.dsa.graph;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dijkstra {

    public static void main(String[] args) {

        Queue<List<Integer>> q = new PriorityQueue<>(Comparator.comparingInt(a -> a.get(0)));
        q.add(List.of(5, 2));
        q.add(List.of(2, 3));
        q.add(List.of(1, 9));
        q.add(List.of(4, 5));
        q.add(List.of(3, 3));

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
