package programers;

public class Chiper {

    public static void main(String[] args) {

        String cipher="dfjardstddetckdaccccdegk";
        int code =4;

        char[] c = new char[cipher.length()];

        for(int i=0; i<=cipher.length(); i++){
            if(i%code==0 && i!=0){
                c[i-1] = cipher.charAt(i-1);
            }
        }

        System.out.println(String.copyValueOf(c).replace("\\u0000",""));
    }
}
