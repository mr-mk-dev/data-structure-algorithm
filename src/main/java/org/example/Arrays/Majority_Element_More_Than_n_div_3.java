package org.example.Arrays;

import java.util.ArrayList;
import java.util.TreeMap;

public class Majority_Element_More_Than_n_div_3 {
    public static void main(String[] args) {
        System.out.println(findMajority(new int[]{2,2,4,2,2,2
                ,2,3,3,3,9,9,9,9,9,9,4,4,4,4,4,4,2,2,2,2,9,9,9,9,9,
                2,2,2,2,4,4,4,4,4,4,4,4,4,2,2,2
        }));

    }
    static ArrayList<Integer> findMajority(int[] arr) {
        int freq = arr.length / 3 ;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int x : arr){
            map.put(x ,map.getOrDefault(x,0)+1 );
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(var entry : map.entrySet() ){
            if(entry.getValue() > freq){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
