package programers;

public class Success {

    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db ={{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        String answer = "";

        for(String[] user: db){
            if(user[0].equals(id_pw[0])){
                if(user[1].equals(id_pw[1])){
                    answer="login";
                }else{
                    answer= "wrong pw";
                }
            }
        }

    }
}
