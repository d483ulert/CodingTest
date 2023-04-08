package programers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Near {

    public static void main (String[] args) {
        String my_string = "We are the world";

        Arrays.asList(my_string.split("")).stream()
                .distinct()
                .collect(Collectors.joining());

    }
}
