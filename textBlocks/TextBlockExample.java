package textBlocks;

public class TextBlockExample {
    public static void main(String[] args) {

        String name = "everyone";
        extracted(name);
    }

    private static void extracted(String name) {
        String text  = """
                Hello  %s
                I'm amazed you all are here.
                Welcome to @2026
                """.formatted(name);
        System.out.println(text);
    }
}
