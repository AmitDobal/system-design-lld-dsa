package com.amit.all.dsa.heap.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Heap {

    ArrayList<Integer> list;

    public Heap() {
        this.list = new ArrayList<>();
        this.list.add(null);
    }

    public void insert(int val) {
        int idx = list.size();
        list.add(val);

        while (idx > 1) {
            int parentIdx = idx / 2;
            if (list.get(parentIdx) < list.get(idx)) {
//                int temp = list.get(parentIdx);
//                list.set(parentIdx, list.get(idx)) ;
//                list.set(idx, temp);

                Collections.swap(list, parentIdx, idx);
                idx = parentIdx;
            } else {
                return;
            }
        }
    }

    public void delete() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Heap is empty.");
        }

        if(list.size() == 2){
            list.removeLast();
            return;
        }

        int lastVal = list.removeLast();
        list.set(1, lastVal);

        // Heapify down
        int idx = 1;

        while(true){
            int leftIdx = 2  * idx;
            int rightIdx = 2 * idx + 1;
            int swapIdx = idx;

            if(leftIdx < list.size() && list.get(leftIdx) > list.get(swapIdx)){
                swapIdx = leftIdx;
            }

            if(rightIdx < list.size() && list.get(rightIdx) > list.get(swapIdx)){
                swapIdx = rightIdx;
            }

            if(swapIdx == idx){
                break;
            }
            Collections.swap(list, idx, swapIdx);
            idx = swapIdx;
        }

    }

    public boolean isEmpty() {
        return list.size() <= 1;
    }

    public List<Integer> heapify(List<Integer> orgList){
        List<Integer> res = new ArrayList<>();
        res.add(null);
        res.addAll(orgList);

        for(int i = res.size() - 1; i >= 1; i--){
            int leftIdx = 2 * i;
            int rightIdx = 2 * i + 1;

            int swapIdx = i;
            if(leftIdx < res.size() && res.get(leftIdx) > res.get(swapIdx)){
                swapIdx = leftIdx;
            }

            if(rightIdx < res.size() && res.get(rightIdx) > res.get(swapIdx)){
                swapIdx = rightIdx;
            }

            if(swapIdx == i){
                continue;
            }
            Collections.swap(res, i, swapIdx);
        }
        return res;
    }

}
