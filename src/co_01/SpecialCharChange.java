package co_01;

import java.util.Scanner;

public class SpecialCharChange {

    public static void main(String[] args) {
        SpecialCharChange T = new SpecialCharChange();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }

    private String Solution(String str) {
        String answer = "";
        char [] c = str.toCharArray();  //str을 기반으로 한 문자 문자배열 생성.
        int lt=0, rt=str.length()-1;

        while(lt < rt) {
            if(!Character.isAlphabetic(c[lt])){
                lt++;
            }
            else if(!Character.isAlphabetic(c[rt])){
                rt--;
            }
            else{
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(c);
        return answer;
    }
}
