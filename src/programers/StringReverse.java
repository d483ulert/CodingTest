package programers;

import java.util.Arrays;

public class StringReverse {

    public static void main(String[] args) {
        String before = "aaa";
        String after = "bbb";
        char [] a = before.toCharArray();
        char [] b = after.toCharArray();

        System.out.println(new String(a).equals(new String(b)) ? 1: 0);
    }
}
