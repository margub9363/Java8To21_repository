package var;

import java.util.List;

public class VarExample {
    public static void main(String[] args) {
        var list = List.of("Rahman", "Tannu");
        var list1 = List.of(1,23);

        var x = "abc";
//        x=24;
        var var = "abc";
    }
//    private static void printName(String name) {
    private static void printName(var name) {
        System.out.println(name);
    }
}
