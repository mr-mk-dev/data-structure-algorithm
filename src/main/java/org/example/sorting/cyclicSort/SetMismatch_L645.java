package org.example.sorting.cyclicSort;

import java.util.Arrays;

public class SetMismatch_L645 {

    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(Arrays.toString(findingMissing(arr)));
    }

    static int[] findingMissing(int[] arr){
        int i = 0;
        while (i != arr.length){
            if(arr[i] != i+1){
                if(arr[i] != arr[arr[i]-1]){
                    int temp = arr[arr[i]-1];
                    arr[arr[i]-1] = arr[i];
                    arr[i]= temp;
                }else {
                    i++;
                }

            }else {
                i++;
            }
        }

        for(int j = 0; j<arr.length; j++){
            if(arr[j] != j+1){
                return new int[]{arr[j] , j+1};
            }
        }
        return new int[]{-1,-1};
    }

}
