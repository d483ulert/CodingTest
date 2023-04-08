package programers;

import java.util.Arrays;

public class Near {

    public static void main (String[] args) {
        int [] array = {3, 10, 28};
        int n = 20;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++) {
            System.out.println(Math.abs(n - array[0]));
            /**
             * 20 - 3  = 17
             */
            System.out.println(Math.abs(n - array[i]));
            /**
             * 20-3 = 17
             * 20-10 = 10
             * 20-28 = 8
             */
            if (Math.abs(n - array[0]) > Math.abs(n - array[i])) {
                array[0] = array[i];
            }
        }
        System.out.println(array[0]);
    }
}
