package dynamicPrograming;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    static int n,m;
    static int []dy;

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt(); //동전의 개수
        int [] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        m=sc.nextInt(); //거슬러줄돈
        dy=new int[m+1];

        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0]=0;
        for(int i=0; i<n; i++) {
            for(int j=arr[i]; j<=m; j++) {
                //기존 값보다 작으면 바꿔줌
                dy[j]=Math.min(dy[j],dy[j-arr[i]]+1);
            }
        }


    }
}
