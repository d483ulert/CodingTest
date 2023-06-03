package programers;

public class HamBurger {

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int answer =0;
        //빵 야채 고기 빵 순서로
        // 1: 빵 2: 야채 3: 고기

        int[] stack = new int[ingredient.length];
        int sp = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            System.out.println(sp);
            if (sp >= 4 && stack[sp - 1] == 1
                    && stack[sp - 2] == 3
                    && stack[sp - 3] == 2
                    && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }


    }
}
