package programers;

import java.util.Arrays;

public class Near {

    public static void main (String[] args) {
        int [] sides = {1,2,3};
        int answer= 2;
        //가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야한다.
        Arrays.sort(sides);
        if(sides[0]+sides[1] > sides[2]){
            answer = 1;
        }

    }
}
