package co_01;

import java.util.Scanner;

public class ScoreCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] q = new int [n];
        int acc=0,answer=0;

        for(int i = 0; i<n; i++){
            q[i]=sc.nextInt();
        }

        for(int i =0; i<n; i++){
            if(q[i] == 1){
                acc++;
                answer+=acc;
            }else acc=0;
        }
        System.out.println(answer);
    }
}
