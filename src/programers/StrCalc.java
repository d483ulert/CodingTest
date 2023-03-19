package programers;

public class StrCalc {

    public static void main(String[] args) {
        String my_string = "3 + 4";
        String [] s = my_string.split(" ");
        int answer =0;
        answer += Integer.parseInt(s[0]);

        for(int i=1; i<s.length-1; i++){
            if(s[i].equals("+")){
                answer += Integer.parseInt(s[i+1]);
            }
            if(s[i].equals("-")){
                answer -= Integer.parseInt(s[i+1]);
            }
        }
    }

}
