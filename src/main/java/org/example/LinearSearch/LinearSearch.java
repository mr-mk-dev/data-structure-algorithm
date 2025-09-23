package org.example.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] val = {23,44,3,12123,323,444,32,22,556,2};
        int index = findVal(val,2);
        if(index != Integer.MIN_VALUE){
            System.out.println("Value is present : "+index);
        }else {
            System.out.println("Value is not present ");
        }
    }
    static int findVal(int [] arr , int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
}
