package org.example.LinearSearch;

import java.util.Arrays;

public class Min_Max_Find {
    public static void main(String[] args) {
        int[] minMax = min_max(new int[]{23, -343,Integer.MIN_VALUE+7,-2147483640,Integer.MAX_VALUE, 43, 34, 4, 3, 2, 4, 43, 3, 4, 4});
        System.out.println(Arrays.toString(minMax));
    }
    public static int[] min_max(int[] arr){
        int min =arr[0], max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
            if(arr[i] < min){
                min=arr[i];
            }
        }
        return new int[]{min,max};
    }
}
