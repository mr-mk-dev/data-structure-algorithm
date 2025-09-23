package org.example.LinearSearch;

public class Find_MaxSum_Index_2D_Array {

    static int sumMax2DArray(int[][] arr){
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            int val = 0;
            for(int j = 0 ; j<arr[i].length; j++){
                val+=arr[i][j];
            }
            if(val>sum){
                sum=val;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {10,20,30},
                {20,40,60}
        };
        System.out.println(sumMax2DArray(arr));
    }
}
