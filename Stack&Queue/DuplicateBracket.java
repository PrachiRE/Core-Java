package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBracket {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        findDuplicate(str);
    }
    public static void findDuplicate(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(stack.peek()=='(') {
                    System.out.println("Duplicate bracket found");
                    return;
                }
                else {
                    while (stack.peek() !='('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }
            else {
                stack.push(ch);
            }
        }
        System.out.println("No duplicates found");
    }
}
