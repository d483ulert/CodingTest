package programers;

public class FailRate {

    public static void main(String[] args) {

        class Rate{
            int idx;
            double rate;

            public Rate(int idx, double rate){
                this.idx = idx;
                this.rate = rate;
            }
        }
}

    public static int [] Solution(int N, int[] stages){
        int[] user_cnt = new int[N+2];
        int[] user_total_cnt = new int[N+1];

        for(int i=0; i<stages.length; i++){
            user_cnt[stages[i]]++;
        }
        user_total_cnt[N] = user_cnt[N] + user_cnt[N+1];



    }
}