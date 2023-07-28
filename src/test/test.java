package test;

public class test {

    public static void main(String[] args) {

        List<String> list = List.<String>emptyList().add(":(");

    }
    static class List<E>{
        static  <T> List<T> emptyList(){
            return new List<T>();
        }


        List<E> add(E e){
            return this;
        }
    }

}