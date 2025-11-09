package org.example.sorting.cyclicSort;

public class MissingNumber_L268 {


    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(findingMissing(arr));
    }

    static int findingMissing(int[] arr){
        int i = 0;
        while (i!=arr.length){
            if(arr[i] == arr.length){
                i++;
            }
            else if(arr[i] != i){
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
        int val = -1;
        if(arr[arr.length -1 ] == arr.length-1){
            val = arr.length;
        }
        for(int j = 0 ; j < arr.length; j++){
            if(j!=arr[j]){
                val = j;
            }

        }
        return val;
    }
}
