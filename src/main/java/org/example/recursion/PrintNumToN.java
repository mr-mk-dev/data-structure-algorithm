package org.example.recursion;

public class PrintNumToN {

    public static void main(String[] args) {
        printNos(100);
    }

    public static void printNos(int n) {
        if(n==0){
            return;
        }
        printNos(n-1);
        System.out.print(n+" ");
    }
}
