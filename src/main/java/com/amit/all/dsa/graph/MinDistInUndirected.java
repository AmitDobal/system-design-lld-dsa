package com.amit.all.dsa.graph;

import java.util.*;

public class MinDistInUndirected {

    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,3},{3,4},{4,5},{5, 6},{1,2},{2,6},{6,7},{7,8},{6,8}};
        int N = 9;
        int M = 10;
        int[] dist = shortestPath(edges, N, M); //0 1 2 1 2 3 3 4 4
        for(int i = 0; i < N; i++){
            System.out.print(dist[i] + " ");
            //0 1 2 1 2 3 3 4 4
            //0 1 2 1 2 4 3 4 5

        }
    }

    public static int[] shortestPath(int[][] edges, int N, int M) {
        List<Integer>[] adj = new List[N];
        for(int i = 0; i < N; i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }

        boolean[] isVisited = new boolean[N];
        Queue<Integer> q = new LinkedList<>();
        int[] dist = new int[N];

        q.add(0);
        isVisited[0] = true;

        while(!q.isEmpty()){
            int u = q.poll();
            int d = dist[u];
            for(int v: adj[u]){
                if(!isVisited[v]){
                    isVisited[v] = true;
                    dist[v] = d + 1;
                    q.add(v);
                }
            }
        }

        return dist;
    }
}
