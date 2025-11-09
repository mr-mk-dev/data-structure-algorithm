package org.example.sorting.cyclicSort;

public class Find_1_Duplicate_num_L287 {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3};
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr){
        int i = 0;
        while (i!=arr.length){
            if(arr[i] != i+1){
                if(arr[i] != arr[arr[i]-1]){
                    int temp = arr[arr[i]-1];
                    arr[arr[i]-1] =arr[i];
                    arr[i] = temp;
                }else {
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }
}
