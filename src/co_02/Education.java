package co_02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Education {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String require = sc.next();
        String edu = sc.next();
        Queue<Character> q = new LinkedList<>();

        for(char x : require.toCharArray()){
            q.offer(x);
        }

       for(char x : edu.toCharArray()){
           if(q.contains(x)){
               if(x != q.poll()){
                   System.out.println("NO");
               }
           }
       }
       if(!q.isEmpty()){
           System.out.println("NO");
       }else {
           System.out.println("Yes");
       }
    }
}
