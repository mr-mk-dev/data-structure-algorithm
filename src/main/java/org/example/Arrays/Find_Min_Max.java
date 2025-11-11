package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_Min_Max {

    public static void main(String[] args) {
        System.out.println(getMinMax(new int[]{34,-6,897,2,56,1,
                -89,90,1000}));
    }

    public static ArrayList<Integer> getMinMax(int[] arr) {
        int min = arr[0] , max = arr[0] ;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return new ArrayList<>(Arrays.asList(min,max));
    }
}
