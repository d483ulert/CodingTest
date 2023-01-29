package co_02;

import java.util.Scanner;
import java.util.Stack;

public class PostFix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int answer = 0;

        Stack <Integer> stack = new Stack<>();
        for(char x: str.toCharArray()) {
            if(Character.isDigit(x)) { //isDigit 숫자 판별
                stack.push(x-48);   // 아스키코드로 문자-48 해줘야 숫자
            }else {
                int rt=stack.pop();
                int lt=stack.pop();
                if(x=='+') {
                    stack.push(lt+rt);
                }else if(x=='-') {
                    stack.push(lt-rt);
                }else if(x=='*') {
                    stack.push(lt*rt);
                }else if(x=='/') {
                    stack.push(lt/rt);
                }
            }
        }

        answer=stack.get(0);

        System.out.println(answer);
    }
}
