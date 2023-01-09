package co_01;

import java.util.ArrayList;
import java.util.Scanner;

public class StrCompress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(arr[0]);

        for(int i=1;i<n;i++){
            if(arr[i] > arr[i-1]){
                arrayList.add(arr[i]);
            }
        }

        System.out.println(arrayList);
    }
}