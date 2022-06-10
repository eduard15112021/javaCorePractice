package mane.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lesson {

    public static void main(String[] args) {
        second<Integer> se=(a,b)-> a+b;
        first fi=()-> System.out.println("it's work");
        fi.get();
        System.out.println(se.sum(5,6));
//        third<String,String,Integer> th=(a,b,c)->{
//            System.out.println(a+b+c);
//        };
        third<Integer,Double,Integer> sm=(a,b,c)->{
            System.out.println("вот что вышло: ");
            b=b+a+c;
            System.out.println(b);
        };
        sm.run(5,58.6,7);
    }

}
