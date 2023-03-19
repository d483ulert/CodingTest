package programers;

import static java.util.Arrays.stream;

public class ArrayMaxCalc {

    public static void main(String[] args) {
        int[] arr = {1,8,3};
        int [] answer= new int[2];

        answer[0]=stream(arr).max().getAsInt();

        for(int i=0; i<arr.length; i++){
            if(answer[0] == arr[i]){
                answer[1] =i;
            }
        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
