package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Similer {

    public static void main(String[] args) {
        String [] s1 = {"a", "q","b", "c"};
        String [] s2 = {"com", "z","q","b", "d", "p", "c"};

        ArrayList newS1 = new ArrayList(Arrays.asList(s1));
        ArrayList newS2 = new ArrayList(Arrays.asList(s2));


        int cnt = (int) newS1.stream()
                .filter(item -> newS2.stream().anyMatch(Predicate.isEqual(item)))
                .count();
        System.out.println(cnt);
    }
}
