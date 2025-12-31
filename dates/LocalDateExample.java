package dates;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        LocalDate localDate1 = LocalDate.of(2018, 07, 17);
        System.out.println("LocalDate1: " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018, 02);
        System.out.println("localDate2: " + localDate2);

        // Getting Values from Local Date
        System.out.println("getMonth " + localDate.getMonth());
        System.out.println("getMonthValue " + localDate.getMonthValue());
        System.out.println("getMonthValue " + localDate.getMonthValue());

//        Modifying Local Date
        LocalDate localDate3 = LocalDate.now().plusDays(7);
        System.out.println("LocalDate plus :" + localDate3);
    }
}
