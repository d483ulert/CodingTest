package co_01;

import java.util.Scanner;

public class PalindromeStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str= str.toUpperCase();
        int len = str.length();
        System.out.println("str.length(): "+len);
        System.out.println("len/2: "+ len/2);
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) {
                System.out.println("str.charAt(len-i-1): "+str.charAt(len-i-1));
                System.out.println("회문아님");
            }
            else{
                System.out.println("str.charAt(len-i-1): "+str.charAt(len-i-1));
                System.out.println("회문임");
            }
        }
    }
}
