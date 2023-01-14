package co_01;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Pbonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] answer = new int[n];

        answer[0]=1;
        answer[1]=1;

        for(int i=2; i<n;i++){
            answer[i]=answer[i-2]+answer[i-1];
        }

        for (int i : answer){
            System.out.println(i);
        }
    }
}


