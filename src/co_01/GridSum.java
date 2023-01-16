package co_01;

import java.util.Scanner;

public class GridSum {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int [][] grid = new int [5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        int answer = Integer.MIN_VALUE;
        int sum1, sum2;

        for(int i=0; i<5; i++){
            sum1=sum2=0;
            for(int j=0; j<5; j++){
                sum1+=grid[i][j];
                sum2+=grid[i][j];
            }
            answer=Math.max(answer,sum1);
            answer=Math.max(answer,sum2);
        }
        sum1=sum2=0;
        for(int i=0;i<5;i++){
            sum1+=grid[i][i];
            sum2+=grid[i][5-i-1];
        }

        answer=Math.max(answer,sum1);
        answer=Math.max(answer,sum2);
        System.out.println(answer);

    }
}
