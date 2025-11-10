package org.example.String;

public class RevStr {

    public static void main(String[] args) {
        String str = "Manish";
        System.out.println(reverseString(str));

    }

    public static String reverseString(String s) {
        char[] arr =s.toCharArray();
        int j = arr.length-1;
        for(int i = 0; i<arr.length/2; i++){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        return new String(arr);

    }
}
