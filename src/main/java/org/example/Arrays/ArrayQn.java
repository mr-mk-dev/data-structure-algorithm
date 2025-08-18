package org.example.Arrays;


public class ArrayQn {
    public static void main (String[] args) {


//    Find the maximum element in an array.
        int[] arr = new int[] {34 , 4334 , 50000 , 32456 , 2 , 3 , -1 , 43 ,
                35 , 4 , 54 , 5 , 345 , 34 , -53 , 45 , 0 , 4 , 5 , 345 , 34
                , 23 , -4 , 23 , 4 , 234 , -23 , 23 , 423 , 42 , 34 , -234 , 3 , 432 , -423,4};
//
//        int min = arr[0], max = arr[0];
//
//        for (int i = 0 ; i< arr.length ; i++){
//            if(min > arr[i]){
//                min = arr[i];
//            }
//            else if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//        System.out.println(min+" "+max);


//    Find the minimum element in an array.
//        int m = arr[0];
//        for(int i= 0 ; i<arr.length ; i++){
//            if(m>arr[i])
//                m=arr[i];
//        }
//        System.out.println(m);

//    Calculate the sum of all elements in an array.
//        int sum = 0;
//        for(int i=0; i< arr.length;i++){
//            sum+= arr[i];
//        }
//        System.out.println(sum);

//    Calculate the average (mean) of array elements.
//        double avg = (double) sum / arr.length;
//        System.out.println("Average is : " +avg);

//    Search for an element in an array (linear search).
//        int val = 45;
//        for(int i= 0 ; i< arr.length; i++){
//            if(arr[i] == val){
//                System.out.println("Value found at : " +i);
//            }
//        }

//    Count the frequency of each element in an array.
//        int[] freq = new int[arr.length];
//        System.out.println(Arrays.toString(freq));
//
//        for(int i = 0 ; i<arr.length -1; i++){
//            int count = 1;
//            for (int j = i+1; j<arr.length ; j++){
//                if(arr[i] == arr[j]){
//                    arr[j] = Integer.MIN_VALUE;
//                    count++;
//                }
//            }
//            if(arr[i]!=Integer.MIN_VALUE){
//                freq[i]=count;
//            }else {
//                freq[i]=-1;
//            }
//        }
//
//        System.out.println(Arrays.toString(freq));

//    Reverse an array in-place.

//        System.out.println("Before :" + Arrays.toString(arr));
//        int j = arr.length -1,temp ;
//        for(int k = 0 ; k < arr.length/2; k++){
//            temp = arr[k];
//            arr[k] = arr[j];
//            arr[j] = temp;
//            j--;
//        }
//        System.out.println("After:" + Arrays.toString(arr));

//    Check if an array is a palindrome (same forwards and backwards).

        int arr2[] = {1 , 2 , 3 , 4 , 5 , 5 , 4 , 3 , 2 , 1};
//
//        int j = arr2.length - 1, flag = 0;
//        for (int i = 0 ; i < arr2.length/2 ; i++) {
//            if (arr2[i] != arr2[j]) {
//                flag = 1;
//                break;
//            }
//            j--;
//        }
//        System.out.println(flag == 0 ? "Palindrome":"Not palindrome");

//    Find the second largest element in an array.

//        int max = arr[0],sec=arr[0];
//        for (int j : arr) {
//            if (j > max) max = j;
//        }
//
//        for (int j : arr) {
//            if (j > sec && j < max) {
//                sec = j;
//            }
//        }
//        System.out.println("First Largest element : "+max +" , 2nd largest : "+sec);

//    Find the second smallest element in an array.

//        int min = arr[0],secSmall=arr[0];
//        for (int j : arr) {
//            if (j < min) min = j;
//        }
//
//        for (int j : arr) {
//            if (j < secSmall && j > min) {
//                secSmall = j;
//            }
//        }
//        System.out.println("Smallest :"+min+" , secondMIn : "+secSmall);

//    Count the number of even and odd elements in an array.

//        int evenCount = 0, oddCount = 0;
//
//        for (int i : arr) {
//            if (i % 2 == 0) evenCount++;
//            else oddCount++;
//        }
//        System.out.println(
//                "Array Length :" + arr.length + " ,Even count :" + evenCount + " ,Odd count :" + oddCount);

//    Count the number of positive and negative numbers in an array.
//        int neg = 0, pos = 0;
//        for (int i : arr) {
//            if (i < 0) neg++;
//            else pos++;
//        }
//        System.out.println("Neg count : " + neg + " ,pos count : " + pos);

//    Copy one array into another array.
//        int[] arrClone = arr.clone();
//        System.out.println(Arrays.toString(arrClone));

//    Merge two arrays into a single array.
//        int length = arr.length + arr2.length, j = 0,k=0;
//        int[] arrMerge = new int[length];

//        for (int i = 0 ; i < arrMerge.length ; i++) {
//            if (!(i >= arr.length)) {
//                arrMerge[i] = arr[j];
//                j++;
//            }else {
//                arrMerge[i] = arr2[k];
//                k++;
//            }
//        }
//        System.out.println(Arrays.toString(arrMerge));

//    Sort an array using Bubble Sort.
//        int temp;
//        for(int i = 1 ; i<arr.length; i++){
//            for(int j= 0 ; j<arr.length -i; j++){
//                if(arr[j] > arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//    Find the index of the first occurrence of an element.
//        int ele = 4;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==ele) {
//                System.out.println(i);
//                break;
//            }
//        }

//    Find the index of the last occurrence of an element.
//        int ele = 4;
//        for(int i=arr.length-1;i>0;i--){
//            if(arr[i]==ele) {
//                System.out.println(i);
//                break;
//            }
//        }

//    Find the largest element at even index.
//        int lar =arr[0];
//        for(int i = 0; i<arr.length; i=i+2){
//            if(arr[i]>lar ){
//                lar= arr[i];
//            }
//        }
//        System.out.println("Largest even index element : "+lar);


//    Find the smallest element at odd index.
        int small = arr[1];
        for (int i = 1 ; i < arr.length ; i=i+2) {
            if(arr[i] < small){
                small = arr[i];
            }
        }
        System.out.println("Smallest at odd index is :"+small);

//    Print all elements of an array in reverse order (without actually reversing).
//        for(int i=arr.length-1;i>0;i--){
//            System.out.print(arr[i]+" , ");
//        }
    }
}
