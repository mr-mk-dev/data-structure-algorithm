package org.example.String;

import java.util.ArrayList;

public class Str_Qn {
    public static void main (String[] args) {

        String str = new String("Manish Kumar , I'm from ramgrah Jharkhand");
        String str2 = "Ranjeet is a good boy he does multitasking";

//        Find the length of a string without using built-in functions.
        int counter = 0;
        for (char i : str.toCharArray()) {
            counter++;
        }
        System.out.println(str.length() == counter);

//        Reverse a string manually (without StringBuilder.reverse()).
        char[] arr = new char[str.length()];
        int j = 0;
        for (int i = str.length() - 1 ; i >= 0 ; i--) {
            arr[j] = str.charAt(i);
            j++;
        }
        String string = new String(arr);
        System.out.println(string);

//        Check if a string is a palindrome.
        String pali = "wonder rednow";
        int secPointer = pali.length() - 1, flag = 0;
        for (int i = 0 ; i < pali.length() / 2 ; i++) {
            if (pali.charAt(i) != pali.charAt(secPointer)) {
                flag = 1;
            }
            secPointer--;
        }
        System.out.println(flag == 1 ? "Not_A_Palindrome" : "Palindrome");

//        Count the number of vowels and consonants in a string.


        int vowelCount = 0, con = 0;
        for (int i = 0 ; i < str.length() ; i++) {
            char val = str.charAt(i);
            if (val >= 'a' && val <= 'z' || val >= 'A' && val <= 'Z') {
                if (val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u' || val == 'A' || val == 'E' || val == 'I' || val == 'O' || val == 'U') {
                    vowelCount++;
                } else {
                    con++;
                }
            }
        }
        System.out.println(
                "Length " + str.length() + " ,Vowel count : " + vowelCount + " ," +
                        "Consonant Count : " + con);

//        Count the number of words in a string
        int words = 0;

        for (int i = 0 ; i < str.length() ; i++) {
            int val = (int) str.charAt(i);
            if ((val >= 65 && val <= 90) || (val >= 97 && val <= 122)) {
                words++;
            }
        }
        System.out.println("No of words : " + words);

//        Convert a string to uppercase and lowercase (without using built-in).

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0 ; i < sb.length() ; i++) {
            int val = (int) sb.charAt(i);
            if (val >= 97 && val <= 122) {
                val = val - 32;
            }
            sb.setCharAt(i , (char) val);
        }
        System.out.println("Upper case :" + sb);

        for (int i = 0 ; i < sb.length() ; i++) {
            int val = (int) sb.charAt(i);
            if (val >= 65 && val <= 90) {
                val = val + 32;
            }
            sb.setCharAt(i , (char) val);
        }
        System.out.println("Lower case :" + sb);


//        Remove all spaces from a string.
        StringBuilder strTrim = new StringBuilder();
        for (int i = 0 ; i < str.length() ; i++) {
            if (str.charAt(i) != ' ') {
                strTrim.append(str.charAt(i));
            }
        }
        System.out.println(strTrim);

//        Remove vowels from a string.
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0 ; i < str.length() ; i++) {
            char val = str.charAt(i);

            if (val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u' || val == 'A' || val == 'E' || val == 'I' || val == 'O' || val == 'U') {

            } else {
                stringBuilder.append(val);
            }
        }
        System.out.println(stringBuilder);


//        Find the ASCII value of each character in a string.
        for (int i = 0 ; i<str.length(); i++){
            System.out.println("ASCII VAL OF "+str.charAt(i)+" : "+(int)str.charAt(i));
        }

//        Find the frequency of each character in a string.

        ArrayList<Integer> track = new ArrayList<>();

        for(int i = 0; i<str.length() ; i++){
            int charCount = 0;
            int flag2 = 0 ;
            for(int val : track){
                if ((int) str.charAt(i) == val) {
                    flag2 = 1;
                    break;
                }
            }
            if(flag2 == 0) {
                for (int m = 0 ; m < str.length() ; m++) {
                    if (str.charAt(i) == str.charAt(m))
                        charCount++;
                }
                track.add((int) str.charAt(i));
                System.out.println("Value :" + str.charAt(
                        i) + " having fq : " + charCount);
            }
        }


//        Find the first non-repeating character in a string.

//        Find the first repeating character in a string.

//        Check if two strings are anagrams of each other.

//        Count the number of digits, letters, and special characters in a string.

//        Remove duplicate characters from a string.

//        Find the maximum occurring character in a string.

//        Find the minimum occurring character in a string.

//        Check if a string contains only digits.

//        Print all substrings of a string.

    }
}
