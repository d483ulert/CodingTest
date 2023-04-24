package programers;

import java.util.HashMap;

public class RememberScore {

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};
        int sum = 0;
        int [] return_data = new int [photo.length];
        HashMap<String,Integer> hashMap = new HashMap();

        for(int i=0; i<name.length; i++){
            hashMap.put(name[i],yearning[i]);
        }

        for(int i=0; i< photo.length; i++){
            for(int j =0; j< photo[i].length; j++){
                if (hashMap.containsKey(photo[i][j])){
                    sum += hashMap.get(photo[i][j]);
                }
            }
            return_data[i] = sum;
            sum=0;
        }
        System.out.println(return_data[0]);
    }
}
