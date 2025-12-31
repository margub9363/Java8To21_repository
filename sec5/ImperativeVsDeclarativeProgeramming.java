package sec5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ImperativeVsDeclarativeProgeramming {
    public static void main(String[] args) {

//        Imperative
        // Ex1:
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        System.out.println("Sum using imperative Approach: " + sum);

        // Ex2:

//        Declarative
        // Ex1:
        int sum1 = IntStream.range(0, 100).sum();
        System.out.println("Sum using Declarative Approach: " + sum1);
    }
}
