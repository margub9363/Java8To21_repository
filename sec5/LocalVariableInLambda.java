package sec5;

import java.util.function.Consumer;

public class LocalVariableInLambda {
    public static void main(String[] args) {
        int i =0;
        Consumer<Integer> c1 = (i1) -> {
            System.out.println("value is: " + i);
        };
    }
}

