package programers;

public class PersonalityTypeTest {

    public static void main(String[] args) {
        asr();
    }

    public static String asr(){
        String answer = "";
        String [] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int [] choices = {5,3,2,7,5};


        int R = 0, T=0, C=0,F=0,J=0,A=0,M=0,N=0;

        for(int i=0; i<survey.length; i++){

            String sur = survey[i];

            String type = sur.substring(0,1);
            if(choices[i] > 4)
                type=sur.substring(1,2);

            int score = Math.abs(choices[i] - 4 );

            switch (type) {
                case "R" -> R += score;
                case "T" -> T += score;
                case "C" -> C += score;
                case "F" -> F += score;
                case "J" -> J += score;
                case "A" -> A += score;
                case "M" -> M += score;
                case "N" -> N += score;
            }

            String Tp1 = "R";
            String Tp2 = "C";
            String Tp3 = "J";
            String Tp4 = "A";

            if(R < T) Tp1="T";
            if(C < F) Tp2="F";
            if(J < M) Tp3="M";
            if(A < N) Tp4="N";

            answer = Tp1+Tp2+Tp3+Tp4;
        }
        return answer;
    }
}
