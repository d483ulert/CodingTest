package programers;

import java.util.Arrays;

public class IdxChange {


    public static void main(String[] args) {
        String my_string ="hello";
        int num1 = 1;
        int num2 = 2;
        String answer="";

        char [] c = new char[my_string.length()];
        char a;

        for(int i=0; i<my_string.length(); i++){
            c[i]= my_string.charAt(i);
        }

        a = c[num1];
        c[num1] = c[num2];
        c[num2] = a;

        answer = String.valueOf(c);

    }
}
