package co_01;

import java.util.Scanner;

public class CharInStr {

    public static void main(String[] args) {
        CharInStr T = new CharInStr();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.Solution(str));

    }

    private String Solution(String str) {
        String answer = "";
        int m= Integer.MIN_VALUE;
        String [] s = str.split(" ");

        for(String x : s){
            int len  =x .length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }
}
