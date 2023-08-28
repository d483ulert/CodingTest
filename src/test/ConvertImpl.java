package test;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ConvertImpl{

    public static String convert(Integer number, Conversion function){
        return convert(100, String::valueOf);
    }

}
