package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Similer {

    public static void main(String[] args) {
        String [] s1 = {"a", "q","b", "c"};
        String [] s2 = {"com", "z","q","b", "d", "p", "c"};


        ;
        System.out.println(Arrays.asList(s1).stream()
                .filter(item -> Arrays.asList(s2).stream().anyMatch(Predicate.isEqual(item)))
                .count());
    }
}
