package dynamicPrograming;

import java.util.Scanner;

public class MaxAddArr {
    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer =0;
        int n= sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        dy= new int[arr.length];
        dy[0] =1;

        for(int i=1; i<arr.length; i++){
            int max =0;
            for(int j =i-1; j>=0; j--){
                if(arr[j]<arr[i] && dy[j]>max){
                    max=dy[j];
                }
            }
            dy[i]=max+1;
            answer =Math.max(answer,dy[i]);
        }
        System.out.println(answer);
    }
}
