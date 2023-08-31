package test;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class ts
{

    public static void main(String[] args) {

        /**
        IntStream intStream = IntStream.rangeClosed(1,10);
        intStream.skip(3).limit(5).forEach(System.out::print);  // 앞에 3개 자르고 5개 출력 // 4,5,6,7,8


        IntStream stream = IntStream.of(1,2,2,3,3,3,4,5,5,6,6);
        stream.distinct().forEach(System.out::println);

        IntStream intStream = IntStream.rangeClosed(1,10);
        intStream.filter(i->i%2 ==0).forEach(System.out::println);  //2의배수
        intStream.filter(i->i%2 ==0).filter(i -> i%3 == 0).forEach(System.out::println);  // 2의 배수와 3의 배수

        studentStream.sorted(Comparator.comparing(Student:: getBan).thenComparing(Student::getName)).forEach(System.out::print); // 반별로 솔팅

        java.util.stream.Stream<File> fileStream = java.util.stream.Stream.of(new File("eee.text"));

        fileStream.map(File::getName)
                .filter(s -> s.contains("."))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);


        File [] files = {new File("Ex01.text"),new File("Ex02.text"), new File("Ex03.text"),
                new File("Ex04.text"), new File("Ex05.text")};

        stream(files).map(File::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Stream<String[]> str = Stream.of(new String[] {"abc","def", "qwe"},
                                        new String[] {"qaz","efg","etw"});

        Stream<String> arr = str.flatMap(Arrays::stream);
        arr.distinct()
                .forEach(System.out::println);

        String []  arr = {"hi my name is kim jisung, Harry Kane is Well"};
        stream(arr).flatMap(line -> Stream.of(line.split(" ")))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        List<String> list = suts.map(Student::getName)
                .collect(Collectors.toList());


        Map<String,Person> map = personStream
                .collect(Collectors.toMap(p->p.getPid(), p->p));

         **/

        String [] strArr = {"Inheritance", "Java", "Lambda", "stream", "OptionalDouble", "IntStream", "Count","sum"};

    /*
    Stream.of(strArr)
                .parallel()
                .forEachOrdered(System.out::println);


    boolean noEmptyStr = Stream.of(strArr)
        .anyMatch(s -> s.length() == 3);
    */

        Optional<String> sWord = Stream.of(strArr)
                .parallel()
                .filter(s->s.charAt(0)=='s').findAny();

        System.out.println(sWord.get());



    }
}
