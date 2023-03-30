package programers;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Once {

    public static void main(String[] args) {
        String answer = "";
        String s="abcabcadc";


        System.out.println(
                Arrays.stream(s.split(""))
                        .collect(Collectors.groupingBy(s1 -> s1))
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue().size()<=1)
                        .map(Map.Entry::getKey)
                        .sorted()
                        .collect(Collectors.joining())
        );
        ;
    }
}
