package programers;

import java.util.Random;
import java.util.Scanner;

public class Str1InStr2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        solution(str1,str2);

    }
    public static int solution(String str1,String str2){
        int answer =2;
        for(int i=0; i<str2.toCharArray().length; i++){
            if(str1.charAt(i) == str2.charAt(i)){
                answer =1;
            }
        }
        return answer;
    }
}
