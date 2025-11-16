package org.example.Arrays;

import java.util.Arrays;

public class MoveAll_0_To_End {
    public static void main(String[] args) {
        int arr[] = {0, 0 ,0 ,3 ,1, 4};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void pushZerosToEnd(int[] arr) {
        int i = 0 , j = arr.length-1;
        while(i < j){
            if(arr[i] == 0){
                swapIndex(arr,i);
                i++;
                j--;
            }else {
                i++;
            }
            if(arr[i-1] == 0){
                i--;
            }
        }
    }

    static void swapIndex(int[] arr, int index){
        for(int i = index; i<arr.length-1; i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}

