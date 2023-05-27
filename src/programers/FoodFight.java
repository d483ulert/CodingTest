package programers;

public class FoodFight {

    public static void main(String[] args) {
        int[] food = {1,3,4,6};
        String answer = "";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }


    }
}
