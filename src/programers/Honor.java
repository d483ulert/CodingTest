package programers;


import java.util.PriorityQueue;

public class Honor {

    public static void main(String[] args) {
        int k = 3;
        int[] score ={10,100,20,150,1,100,200};
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }



        for(int a : answer){
            System.out.print(a+",");
        }
    }
}
