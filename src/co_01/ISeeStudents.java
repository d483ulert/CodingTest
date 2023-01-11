package co_01;

import java.util.Scanner;

public class ISeeStudents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int [] students = new int[cnt];
        int answer=1;

        for (int i=0; i<cnt; i++){
            students[i]=sc.nextInt();
        }
        int max = students[0];

        for(int i=1; i<cnt; i++){
            if(students[i] > max){
                answer++;
                max= students[i];
            }
        }

        System.out.println("answer: "+answer);

    }
}
