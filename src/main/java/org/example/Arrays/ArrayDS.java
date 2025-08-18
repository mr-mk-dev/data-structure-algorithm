package org.example.Arrays;

public class ArrayDS {
    public static void main (String[] args) {

//        int [] arr = new int[3];
//        int [] arr2 = {3,5,3,5,5};
//        int [] arr3 = new int[] {88,89,57,7};
//        int [][] multiArr1 = new int[4][];
//        Object strArr[] = new String[3];
//
//        strArr[0] = 34; // Throwing : ArrayStoreException
//        System.out.println({334,453,43}); // Compile time error
//        System.out.println(Arrays.deepToString(new int[5][2][4]).toCharArray());

        int [] arr = {10,20,30,40,50};

//        INSERTION OF VALUE
        arr[0] = 60;

//        ACCESSING VALUE
        int index = 3;
        System.out.println("Accessing values : "+arr[index]);

//        TRAVERSAL VALUES
        System.out.println("TRAVERSAL VALUES");
        for (int j : arr) {
            System.out.println(j);
        }

//        SEARCHING VALUE
        int value = 40  , flag=0;
        for (int i:arr){
            if(i==value){
               flag = 1;
            }
        }
        System.out.println(flag==1 ? "Value found ": "Value not found");

//        DELECTION OF VALUE
        arr[index ] =0;

        System.out.println("Value can't deleted it could be 0 : arr[index]="+ arr[index]);

    }

}
