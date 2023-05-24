package programers;

import java.util.Arrays;
import java.util.Collections;

public class FruitSales {

    public static void main(String[] args) {
        int k = 3;
        int m =4;
        int [] score = {1, 2, 3, 1, 2, 3, 1};
        int [] arr1 = new int[m];

        Integer[] arr2 = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());


        for(int i=0; i<m; i++){
            arr1[i] = arr2[i];
        }

        Arrays.sort(arr1);

        arr1[0]*m
    }
}
