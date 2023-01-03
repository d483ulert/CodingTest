package co_01;

import java.util.Scanner;

public class RemoveDuplicaionStr {

    public static void main(String[] args) {
        String answer="";
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==i){
//                indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며

                System.out.println("i: "+i);
                System.out.println("str.charAt(): "+str.charAt(i));
                System.out.println("str.indexOf(str.charAt(i)): "+str.indexOf(str.charAt(i)));
                answer+=str.charAt(i);
            }
        }
        System.out.println("answer: "+answer);
    }
}
