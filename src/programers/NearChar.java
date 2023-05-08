package programers;

public class NearChar {
    public static void main(String[] args) {
        String s = "banana";
        int [] answer = new int[s.length()];
        answer[0] = -1;

        for(int i=1; i<s.length(); i++){
            int x = s.lastIndexOf(s.substring(i,i+1),i-1);


            if(x != -1){
                answer[i] = i -x;
            }else {
                answer[i] = x;
            }
        }
    }
}
