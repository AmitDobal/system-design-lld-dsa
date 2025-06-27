package com.amit.dsa;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public boolean isCycle(int V, List<Integer>[] adj) {
        boolean[] isVisited = new boolean[V];

        for(int i = 0; i < V; i++){
            if(!isVisited[i]){
                if(bfs(i, adj, isVisited)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean bfs(int i,
                        List<Integer> adj[],
                        boolean[] visited) {

        // Queue to store {node, parent}
        Queue<int[]> q = new LinkedList<>();

        /* Push initial node in queue
        with no one as parent */
        q.add(new int[]{i, -1});

        // Mark the node as visited
        visited[i] = true;

        // Until the queue is empty
        while (!q.isEmpty()) {

            // Get the node and its parent
            int[] current = q.poll();
            int node = current[0];
            int parent = current[1];

            // Traverse all the neighbors
            for (int it : adj[node]) {

                // If not visited
                if (!visited[it]) {
                    // Mark the node as visited
                    visited[it] = true;

                    /* Push the new node in queue
                    with curr node as parent */
                    q.add(new int[]{it, node});
                }

                /* Else if it is visited with some
                different parent a cycle is detected */
                else if (it != parent) return true;
            }
        }
        return false;
    }

    private boolean bfs1(int src,
                         List<Integer> adj[],
                         boolean[] isVisited){

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0, -1));
        isVisited[0] = true;
        while (!q.isEmpty()) {
            Node node = q.poll();
            List<Integer> neighbors = adj[node.val];

            for (int neighbor : neighbors) {
                if (!isVisited[neighbor]) {
                    isVisited[neighbor] = true;
                    q.add(new Node(neighbor, node.val));
                } else if ( node.parent != neighbor) {
                    return true;
                }
            }
        }
        return false;
    }

    class Node {
        int val;
        int parent;

        Node(int val, int parent) {
            this.val = val;
            this.parent = parent;
        }
    }
}
