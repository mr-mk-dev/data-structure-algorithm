package org.example.sorting.cyclicSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Find_All_Duplicate_442 {

    public static void main(String[] args) {
        int[] arr ={1};
        System.out.println(integerList(arr));
    }
    static List<Integer> integerList (int[] arr){
        int i = 0;
        List<Integer> duplicateValues = new ArrayList<>();
        while (i!=arr.length){
            if(arr[i] != i+1){
                if(arr[i] != arr[arr[i]-1]){
                    int temp = arr[arr[i]-1];
                    arr[arr[i]-1] = arr[i];
                    arr[i] =temp;
                }else {
                    if(!duplicateValues.contains(arr[i])){
                        duplicateValues.add(arr[i]);
                    }
                    i++;
                }
            }else {
                i++;
            }
        }
        Collections.sort(duplicateValues);
        return duplicateValues;
    }





}
