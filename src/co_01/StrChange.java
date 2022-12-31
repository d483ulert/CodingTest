package co_01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StrChange {

    public static void main(String[] args) {
        StrChange T = new StrChange();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String [] str = new String[cnt];

        for(int i=0; i<cnt; i++){
            str[i]=sc.next();
        }
        for (String s : T.Solution(cnt,str)) {
            System.out.println("result: "+s);
        }
    }

    private ArrayList<String> Solution(int cnt, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String s:str){
            String tmp = new StringBuilder(s).reverse().toString();

            answer.add(tmp);
        }
        return answer;
    }

}
