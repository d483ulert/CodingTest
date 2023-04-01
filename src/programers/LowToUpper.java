package programers;

public class LowToUpper {

    public static void main(String[] args) {
        String my_string = "cccCCC";
        char [] c = new char[my_string.length()];

        for(int i=0; i < my_string.length(); i++){
            c[i]=my_string.charAt(i);
        }

        for(int i=0; i<my_string.length();i++){
            if(Character.isUpperCase(c[i])){
                c[i]= Character.toLowerCase(c[i]);
            } else  if(Character.isLowerCase(c[i])){
                c[i]=Character.toUpperCase(c[i]);
            }
        }

        String answer= String.valueOf(c);

    }
}
