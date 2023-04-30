package programers;

public class Dutchil {

    public static void main(String[] args) {
        int n= 8;
        int m= 4;
        int [] section = {2,3,6};

        int start = section[0];
        int end  = section[0]+ (m-1);
        int answer =1;

        for(int i : section ) {
            if (i >= start && i <= end) {
                continue;
            } else {
                start = i;
                System.out.println("start: "+start);
                end = i + (m - 1);
                System.out.println("end: " + end);
                answer++;
                System.out.println("answer: " + answer);
            }
        }
//        return answer;

    }
}
