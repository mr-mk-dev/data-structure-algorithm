package org.example.Arrays;

public class No_Of_digit_Occ {

    public static void main(String[] args) {
        System.out.println(countFreq(new int[]{1,2,3,4,4,4,4,4,4,4,4,4,4,4,5,5,6,7}
                ,4));
    }

    static int countFreq(int[] arr, int target) {
        int count = 0;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;

    }
}
