package co_01;

import java.util.Scanner;
import java.util.Stack;

public class Scope {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();

        String answer="YES";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x=='('){
                stack.push(x);
            }else{
                if(stack.isEmpty()){
                    answer="NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            answer= "NO";
        }

        System.out.println(answer);
    }
}
