package co_02;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String answer = "Yes";

        HashMap<Character,Integer> map = new HashMap();

        for(char x : str1.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x: str2.toCharArray()){
            if(!map.containsKey(x)||map.get(x)==0){
                answer="No";
                return;
            }
            System.out.println("****map1"+map);
            map.put(x,map.get(x)-1);
            System.out.println("****map2"+map);
        }

        System.out.println(answer);
    }
}
