package programers;

public class Jaritsu {

    public static void main(String[] args) {
        int answer = -1;
        int num = 1234;
        int k= 2;
        String n = Integer.toString(num);
        String sk= Integer.toString(k);

        if(n.indexOf(sk) == -1){
            return -1
        }else {
            return n.indexOf(sk)+1;
        }
    }
}
