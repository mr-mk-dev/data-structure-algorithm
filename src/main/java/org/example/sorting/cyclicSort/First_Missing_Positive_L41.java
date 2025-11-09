package org.example.sorting.cyclicSort;

public class First_Missing_Positive_L41 {

    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(findingPositiveMissing(arr));
    }
    static int findingPositiveMissing(int[] arr){
        int i = 0;
        while (i != arr.length ){
            if(arr[i] > arr.length || arr[i] < 1){
                i++;
            }
            else if(arr[i] != i+1){
                if(arr[arr[i]-1] != arr[i] ){
                    int temp = arr[arr[i]-1];
                    arr[arr[i]-1] = arr[i];
                    arr[i] = temp;
                }else {
                    i++;
                }

            }else {
                i++;
            }
        }
        int counter = 1;
        for(int j=0 ; j<arr.length; j++){
            if(arr[j] != counter){
                return j+1;
            }else {
                counter++;
            }
            if(j == arr.length-1 && arr[j] == j+1){
                return arr.length+1;
            }
        }
        return -1;
    }




}
