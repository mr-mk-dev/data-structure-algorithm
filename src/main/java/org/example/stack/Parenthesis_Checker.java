package org.example.stack;

import java.util.Stack;

public class Parenthesis_Checker {

    public static void main(String[] args) {
        String s = "((()))";
        System.out.println(checker(s));
    }
    static boolean checker(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(ch == ')' && top!= '(') return false;
                if(ch == '}' && top!= '{') return false;
                if(ch == ']' && top!= '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
