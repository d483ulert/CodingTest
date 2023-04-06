package programers;

import java.util.Arrays;

public class Game369 {

    public static void main(String[] args) {
        int order = 29423;
        int answer = 0;
        char [] c = (String.valueOf(order)).toCharArray();

        System.out.println(c);

        for (char value : c) {
            if (value == '3' || value == '6' || value == '9') {
                answer++;
            }
        }

        System.out.println(answer);


        System.out.println(Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i->i==3 || i== 6 || i==9).count());
    }
}
