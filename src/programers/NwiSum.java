package programers;

import java.util.Arrays;

public class NwiSum {

    public static void main(String[] args) {
        int j=0;
        int cnt=0;
        int n=3;
        int [] numlist ={4, 5, 6, 7, 8, 9, 10, 11, 12};
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                cnt++;
            }
        }
        int[] answer = new int[cnt];

        for(int i=0; i< numlist.length; i++){
            if(numlist[i] % n ==0){
                answer[j] = numlist[i];;
                j++;
            }
        }

    }
}
