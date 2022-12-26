package co_01;

import java.util.Scanner;

public class ToUpperToLower { // 대소문자 변환

    public static void main(String[] args) {
        ToUpperToLower T = new ToUpperToLower();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(str.length() <=100){
            System.out.println("solution: "+ solution(str));
        }
    }

    public static String solution(String str) {
        String result = "";

        for (char o : str.toCharArray()) {
            if(Character.isLowerCase(o)) result+=Character.toUpperCase(o);
            else result +=Character.toLowerCase(o);
        }

        return result;
    }
}
