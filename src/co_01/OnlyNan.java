package co_01;

import java.util.Scanner;

public class OnlyNan {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer ="";

        for(char x : str.toCharArray()){
            if(x>=48 && x<= 57){
                answer+=x;
            }
        }
        System.out.println("*****");
        System.out.println("answer: "+answer);
    }
}
