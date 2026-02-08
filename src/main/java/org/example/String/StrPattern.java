package org.example.String;

public class StrPattern {
    static String dot = "_____________________________";

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(10);
//        pattern3(7);
//        pattern4(7);
//        pattern5(4);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
//        pattern9(5);
//        pattern10(5);
//        pattern11(5);
//        pattern12(5);
        pattern13(5);
        pattern14(5);
        pattern15(5);
        pattern16(5);
        pattern17(5);
        pattern18(5);
        pattern19(5);
        pattern20(5);
//        pattern28(5);
    }

    public static void pattern2(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(dot);
    }

    public static void pattern1(int size) {
        for (int r = 1; r <= size; r++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(dot);
    }

    public static void pattern3(int size) {
        for (int r = size; r >= 1; r--) {
            for (int col = 1; col <= r; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(dot);
    }

    public static void pattern4(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {

            int total = row > n - 1 ? 2 * n - row : row;
            for (int col = 1; col <= total; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(dot);
    }

    public static void pattern6(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void pattern7(int size){
        for (int i = size; i > 0; i--) {
            for(int j = 0 ; j<size - i ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static  void pattern8(int size){
        for (int i = 0; i < size; i++) {
            for(int j = 0; j<size-i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static  void pattern9(int size){
        for(int i = size ; i > 0 ; i--){

            for(int j = 0 ; j<size-i ; j++){
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i -1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static  void pattern10(int size){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i ; j++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static  void pattern11(int size){
        for (int i = size; i > 0; i--) {
            for(int j = 0 ; j < size - i ; j++)
                System.out.print(" ");
            for(int j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static  void pattern12(int size){
        for (int i = 2*size ; i>0 ; i--) {
            int total = i < size+1 ? (size+1) - i : i - size;
            for (int j = 0; j < size-total; j++)
                System.out.print(" ");
            for (int j = 1; j <= total; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static  void pattern13(int size){
        for(int i = 1 ; i <= size; i++){

            for (int s = 0; s < size - i; s++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if(i > 1 && i< size){
                int middleSpace = ( i - 1 )*2 -1;
                for (int j = 0; j < middleSpace; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(i==size){
                for (int k = 0; k < 2 * size - 1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static  void pattern14(int size){}
    public static  void pattern15(int size){}
    public static  void pattern16(int size){}
    public static  void pattern17(int size){}
    public static  void pattern18(int size){}
    public static  void pattern19(int size){}
    public static  void pattern20(int size){}
    public static  void pattern21(int size){}
    public static  void pattern22(int size){}
    public static  void pattern23(int size){}
    public static  void pattern24(int size){}
    public static  void pattern25(int size){}
    public static  void pattern26(int size){}
    public static  void pattern27(int size){}
    public static void pattern28(int n ){
        for (int i = 1; i < 2*n; i++) {
            int total = i > n ? 2*n-i : i;
            for (int j = 0; j < n-total; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < total; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static  void pattern29(int size){}
    public static  void pattern30(int size){}
    public static  void pattern31(int size){}
    public static  void pattern32(int size){}
    public static  void pattern33(int size){}
    public static  void pattern34(int size){}
    public static  void pattern35(int size){}


}
