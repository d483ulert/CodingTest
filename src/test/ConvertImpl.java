package test;

import java.util.concurrent.TimeUnit;

public class ConvertImpl{

    public static String convert(Integer number, Conversion function){
        return convert(100, String::valueOf);
    }

}
