package programers;

public class SamChongSa {

    public static void main(String[] args) {
        int [] number = {-2, 3, 0, 2, -5};
        int answer =0;

        for(int i=0; i<number.length-2; i++){   //3
            for(int j= i+1; j < number.length-1; j++){ //  4
                for(int k= j+1; k<number.length; k++){ //5
                    if(0 == number[i]+number[j]+number[k]){
                        System.out.println("i:" + i + " j:"+ j +" k:" +k);
                        answer++;
                    }
                }
            }
        }
    }
}
