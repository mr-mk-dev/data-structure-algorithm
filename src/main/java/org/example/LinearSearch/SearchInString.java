package org.example.LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String str = "abc";
        char target = 'c';
        if(searchInString(str,target)){
            System.out.println("Value is present ");
        }else {
            System.out.println("Value is not present ");
        }

    }
    static boolean searchInString(String str,char target){
        char[] arr = str.toCharArray();
        for(int i =0 ; i<arr.length ; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
