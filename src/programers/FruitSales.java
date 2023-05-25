package programers;

import java.util.Arrays;

public class FruitSales {

    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int answer =0;
        Arrays.sort(score);

        for(int i=score.length-1; i>=0; i--){
            if( (score.length - i ) % m == 0){
                answer += score[i] * m; //4개씩
            }
        }



    }
}
