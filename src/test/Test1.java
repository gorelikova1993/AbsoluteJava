package test;

import java.util.concurrent.ThreadLocalRandom;

public class Test1 {
    public static void main(String[] args) {
//        String string1 = "Hello";
//        String string2 = "hello";
//        System.out.println(string1.compareTo(string2));
//        int result = 0;
//        int other = 0;
//        int n = 2;
//
//        System.out.println((result = ++n + (other = (2*(++n)))));
        int rnd = ThreadLocalRandom.current().nextInt(100);
        System.out.println(rnd);
    }
}
