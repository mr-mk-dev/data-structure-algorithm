package org.example.sorting.cyclicSort;

import java.util.Arrays;

public class FindAllDisappearNumber_L448 {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(findNum(arr)));
    }

    static int[] findNum (int[] arr){
        int i = 0;
        while( i!= arr.length){
            if(arr[i] != i+1){
                if(arr[i] != arr[arr[i]-1]){
                    int temp = arr[arr[i]-1];
                    arr[arr[i]-1] = arr[i];
                    arr[i] = temp;
                }else{
                    i++;
                }
            }else {
                i++;
            }
        }

        int counter = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j+1){
                counter++;
            }
        }
        int[] val = new int[counter];
        int index = 0;

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j+1){
                val[index] = j+1;
                index++;
            }
        }
        return val;
    }

}
