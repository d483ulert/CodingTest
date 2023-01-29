package co_02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueuePrincess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();

        int answer=0;

        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=n; i++){
            q.offer(i);
        }
        System.out.println(q);

        while(!q.isEmpty()){
            for(int i=1; i<k; i++){
                q.offer(q.poll());
            }

            q.poll();
            if(q.size()==1)
                answer=q.poll();
        }

        System.out.println(answer);
    }
}
