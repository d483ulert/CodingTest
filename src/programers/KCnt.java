package programers;

public class KCnt {

    public static void main(String[] args) {

        int i = 10;
        int j = 50;
        int k = 5;
        int answer =0;
        String str ="";
        for(int a =i; a<=j; a++){
            str+=a+"";
        }

        System.out.println(str.length());
        System.out.println(str.replace(k+"",""));
        System.out.println(str.replace(k+"","").length());
        System.out.println(str.length()-str.replace(k+"","").length());

    }
}
