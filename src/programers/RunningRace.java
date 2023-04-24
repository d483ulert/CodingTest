package programers;

import java.util.HashMap;

public class RunningRace {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        int n = players.length;

        HashMap<String,Integer> hashMap = new HashMap<>();

        for(int i =0; i<n; i++){
            hashMap.put(players[i],i);
        }

        for(String calling : callings){
            int idx = hashMap.get(calling);
            if(idx >0){
                String tmp = players[idx-1];
                players[idx -1] = players[idx];
                players[idx] = tmp;

                hashMap.put(players[idx-1], idx-1);
                hashMap.put(players[idx],idx);
                System.out.println(hashMap); // map은 키가 중복이 안되니까 덮여씌여짐
            }
        }
    }
}
