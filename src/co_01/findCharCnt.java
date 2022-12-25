package co_01;

import java.util.Scanner;

public class findCharCnt {

    public static void main(String[] args) {
        findCharCnt T  =new findCharCnt();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        System.out.println(T.solution(str,t));

    }

    private int solution(String str, char t) {
        int result = 0;

        str = str.toUpperCase();
        t= Character.toUpperCase(t);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==t) result++;
        }

        return result;
    }
}
