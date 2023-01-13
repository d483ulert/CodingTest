package co_01;

import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] man1 = new int[n];
        int [] man2 = new int[n];

        for(int i=0; i<n; i++){
            man1[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            man2[i] = sc.nextInt();
        }

        ArrayList<String> answer = new ArrayList<>();
        //가위:1 바위:2 보:3

        for(int i=0; i<n; i++){
            if(man1[i] == man2[i]){
                answer.add("D");
            }else if(man1[i]==1 && man2[i] ==3){
                answer.add("A");
            }else if(man1[i] ==2 && man2[i]==1){
                answer.add("A");
            }else if(man1[i] ==3 && man2[i]==2){
                answer.add("A");
            }else answer.add("B");
        }
        System.out.println(answer);
    }

}
