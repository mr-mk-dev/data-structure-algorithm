package org.example.sorting;

import java.util.Arrays;

public class CyclicSort {
    // In Cyclic Sort we have given array from 1 to n number
    // And we need to sort it like this :
    //      Get the first element replace with its original position
    //      Check for after replacing it is equal to index as it
    //      should if not do it till first element is sorted
    //      After that check second element and do the same operation
    //      Do this for till last element

    public static void main(String[] args) {
        int[] arr = {9,7,5,3,2,1,6,0,4,8};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        int i = 0;
        while (i!=arr.length){
            if(arr[i] != i){
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }
        return arr;
    }
}
