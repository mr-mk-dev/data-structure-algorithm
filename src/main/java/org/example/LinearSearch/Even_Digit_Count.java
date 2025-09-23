package org.example.LinearSearch;

public class Even_Digit_Count {

    static  int count(int[] arr){
        int counter = 0;
        for(int i = 0; i<arr.length; i++){
            int evenCount=(int)Math.log10(arr[i])+1;
            if(evenCount % 2 == 0 ){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int [] arr = {1222,2323,444,4346,23,2,3,23,12,3,2,33333,3,213,33333332,123456};

        System.out.println(count(arr));
    }
}
