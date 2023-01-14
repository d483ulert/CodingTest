package co_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int num){
        if(num ==1 ) return false;
        for(int i=2; i<num; i++){
            if(num%1==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            int tmp =arr[i];
            int res=0;
            while (tmp>0){
                int t = tmp%10;
                System.out.println("****t: "+t);
                res=res*10+t;
                System.out.println("****res: "+ res);
                tmp=tmp/10;
                System.out.println("****tmp: "+tmp);
            }
            if(isPrime(res)){
                answer.add(res);
            }
        }

        for(int x : answer){
            System.out.println("x: "+x);
        }
    }
}
