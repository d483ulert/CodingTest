package programers;

import java.util.Scanner;

public class StrPush {
    public static void main(String[] args) {
        int answer =0;
        Scanner sc= new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        for(int i=0; i<A.length(); i++){
            if(A.equals(B)) {
                System.out.println(answer);
            }
            A = A.substring(A.length()-1) + A.substring(0,A.length()-1);
        }
    }
}
