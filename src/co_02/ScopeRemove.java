package co_02;

import java.util.Scanner;
import java.util.Stack;

public class ScopeRemove {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer="";
        Stack <Character> st = new Stack<>();
        for(char x: str.toCharArray()) {
            if(x==')') {
                while(st.pop()!='(');
            }else {
                st.push(x);
            }
        }
        for(int i=0; i<st.size();i++) {
            answer+=st.get(i);
        }

    }

}
