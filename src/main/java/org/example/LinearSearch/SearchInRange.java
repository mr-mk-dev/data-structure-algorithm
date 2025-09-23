package org.example.LinearSearch;

public class SearchInRange {

    public static void main(String[] args) {
        if(searchInString("Manish",'f',2,5)){
            System.out.println("Value is present ");
        }else {
            System.out.println("Value is not present ");
        }
    }
    static boolean searchInString(String str,char target, int from , int to){
        char[] arr =str.toCharArray();

        for(int i = from; i <= to; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
