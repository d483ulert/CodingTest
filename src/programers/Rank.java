package programers;

public class Rank {

    public static void main(String[] args) {
        int[][] score= {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[] answer = new int[score.length];
        int avg = 0;
        int max =0;
        int rank =0;

        for(int i = 0; i< score.length; i++){
            for(int j=0; j<2; j++ ){
                 avg = (score[i][j]+score[i][j])/2;
                 if(max < avg){
                     max = avg;
                     rank=i+1;
                     answer[i]=rank;
                 }
            }
        }
    }
}
