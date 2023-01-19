package co_01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2= sc.nextInt();

        int [] arr1 = new int[n1];
        int [] arr2 = new int[n2];

        for(int i=0; i<n1; i++){
            arr1[i]=sc.nextInt();
        }

        for(int i=0; i<n2; i++){
            arr2[i]=sc.nextInt();
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        int p1=0,p2=0;

        while(p1<n1 && p2<n2){
            if(arr1[p1] < arr2[p2]){
                arrayList.add(arr1[p1]);
            }else arrayList.add(arr2[p2]);
        }
        while (p1<n1) arrayList.add(arr1[p1++]);
        while (p2<n2) arrayList.add(arr2[p2++]);
    }
}
