package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        String inputStr = scr.nextLine();
        checkBalancedBrackets(inputStr);
    }
    public static void checkBalancedBrackets(String inputStr){
        Stack <Character> stk = new Stack<>();
        for (int i=0;i<inputStr.length();i++){
            char ch = inputStr.charAt(i);
            if(ch== '{'|| ch =='(' || ch == '[')
            {
                stk.push(ch);
            }
            else if(ch=='}'){
                handleClosing(stk,'{');

            }else if(ch == ']'){
                handleClosing(stk,'[');
            }else if(ch == ')'){
                handleClosing(stk,'(');
            }

        }
        if(stk.size()!=0)
        {
            System.out.println("Extra Opening Bracket");
            return;
        }
        System.out.println("Brackets are balanced");
    }
    public static  void handleClosing(Stack<Character> stk, char ch){
        if(stk.size()==0){
            System.out.println("Extra Closing Bracket");
            return;
        }
        if(stk.peek() != ch) {
            System.out.println("Bracket Mismatch");
            return;
        }
        else stk.pop();
    }
}
