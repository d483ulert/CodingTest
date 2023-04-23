package programers;

public class FiniteDecimal {
    public static void main(String[] args) {
        int a= 7;
        int b =20;
        int answer= 1; // 유한소수면 1 무한소수면 2
        int newB = b / gcd(a,b);


        while(newB !=1){
            if(newB % 2==0){
                newB /= 2;
            }else if(newB %5 == 0){
                newB /=5;
            }else {
                answer= 2;
            }
        }
    }

    private static int gcd(int a, int b){
        if(b == 0 ) {
            return a;
        }else {
            return gcd(b,a % b);
        }
    }
}
