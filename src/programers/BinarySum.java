package programers;

public class BinarySum {

    public static void main(String[] args) {

        String bin1="10";
        String bin2="11";

        int binary1=Integer.valueOf(bin1,2);
        int binary2=Integer.valueOf(bin2,2);

        int sum = binary1+binary2;

        Integer.toBinaryString(sum);
    }
}
