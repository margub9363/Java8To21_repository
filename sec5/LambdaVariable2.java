package sec5;

import java.util.function.Consumer;

public class LambdaVariable2 {

        static int value = 4; // now it's an instance variable
    public static void main(String[] args) {

        // static int value = 4; // now it's an local variable
        Consumer<Integer> c1 = (i) -> {
            System.out.println(value + i);
        };
        value++;
        c1.accept(5);
    }
}
