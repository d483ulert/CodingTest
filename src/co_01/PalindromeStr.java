package co_01;

import java.util.Scanner;

public class PalindromeStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c =  sc.next().charAt(0);
        int [] answer = new int[str.length()];

       int p = 1000;
       for(int i=0; i<str.length(); i++){ss
           if(str.charAt(i)==c){
               p=0;
                answer[i]=p;
           }else{
               p++;
               answer[i]=p;
           }
       }    p=1000;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i)==c){
                p=0;
            }else{
                p++;
                answer[i]=Math.min(answer[i],p);
            }
        }

       for(int x : answer){
           System.out.println("x: "+x);
       }
    }
}


