package programers;

public class SmallSizeChar {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        int len = p.length();
        long num = Long.parseLong(p);
        int answer =0;

        System.out.println(num); //271
        System.out.println(t.length()); //7
        System.out.println(len); //3
        System.out.println(len+1); // 4
        for(int i=0; i< t.length() - len +1; i++){
            long diff = Long.parseLong(t.substring(i,i+len));
            if(diff <= num){
                answer++;
            }
        }

    }
}
