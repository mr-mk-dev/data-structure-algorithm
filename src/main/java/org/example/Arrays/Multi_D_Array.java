package org.example.Arrays;

import java.util.Arrays;

public class Multi_D_Array {
    public static void main (String[] args) {

        int[][] arr2d = new int[4][5];

//        INSERTION OF VALUE & TRAVERSAL
        int val = 10;
        for(int i =0 ; i< arr2d.length ; i++){
            for (int j=0; j<arr2d[0].length ; j++){
                arr2d[i][j] = val;
                val = val +2;
            }
        }
        System.out.println(Arrays.deepToString(arr2d));


//        ACCESSING ELEMENT BY INDEX

        int row = 3,col=4;
        System.out.println(arr2d[row][4]);

//        SEARCHING VALUE
        int value = 46;

        for(int i =0 ; i< arr2d.length ; i++){
            for (int j=0; j<arr2d[i].length ; j++){
                if(value == arr2d[i][j]){
                    System.out.println("Value found at : ["+i+"]["+j+"]");
                }
            }
        }

//        DELETION OF VALUE

        arr2d[row][col] = 0;
        System.out.println(arr2d[row][col]);



    }
}
