package programers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Yaksu {

    public static void main(String[] args) {
        int n = 24;
        int [] answer ={};

        List<Integer> arr = new ArrayList<>();


        for(int i=1; i*i<=n; i++){
            if(n%i ==0){
                arr.add(i);
                arr.add(n/i);
            }
        }

        Collections.sort(arr);
        answer=arr.stream().mapToInt(Integer::intValue).distinct().toArray();

        System.out.println(answer);
    }
}
