package co_02;

import java.util.Scanner;
import java.util.Stack;

public class ScopeRemove {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        String answer="";

        for (Character x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ;
            }else{
                stack.push(x);
            }
        }
        for(int i=0; i<stack.size(); i++){
            answer+=stack.get(i);
        }
        System.out.println(answer);
    }

}
