package co_01;


import java.util.Scanner;

public class ClassGob {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int answer=0, max=Integer.MIN_VALUE;

        for(int i=0; i<=n; i++){
            int cnt =0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k] ==arr[i][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max=cnt;
                answer=i;
            }
        }
        System.out.println("answer: "+answer);
    }
}
