package greed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Player implements Comparable<Player> {
    public int h, w;
    Player(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Player o) {
        return o.h - this.h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Player> arr =new ArrayList<>();
        for(int i=0; i<n; i++){
            int h=sc.nextInt();
            int w=sc.nextInt();
            arr.add(new Player(h,w));
        }

        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;

        for(Player ob : arr){
            if(ob.w > max){
                max=ob.w;
                cnt++;
            }
        }

    }
}
