public class EnhancedSwitch {

    public static void main(String[] args) {

        int dayOfWeek = 2;
        System.out.println(STR."given Input: \{dayOfWeek} is a \{isItWeekday(dayOfWeek)}");
    }

    private static String isItWeekday( int input) {
        return switch (input) {
            case 1,7 -> "weekend";
            case 2,3,4,5,6 -> "weekday";
            default -> "Invalid Input";
        };
    }
}
