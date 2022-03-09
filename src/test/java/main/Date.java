package main;

import java.time.LocalDate;

public class Date {

    public static void main(String[] args) {

        String CURRENT_WRONG_DATE_REVIEW = LocalDate.now().withMonth(1).withDayOfMonth(31).plusYears(2).toString();
        String QUARTER_END_WINDOW_END_DATE = LocalDate.now().withMonth(2).withDayOfMonth(15).plusYears(2).toString();
        String CURRENT_WRONG_DATE_REMINDER = LocalDate.now().withMonth(2).withDayOfMonth(4).plusYears(2).toString();
        System.out.println(CURRENT_WRONG_DATE_REVIEW);
        System.out.println(QUARTER_END_WINDOW_END_DATE);
        System.out.println(CURRENT_WRONG_DATE_REMINDER);
    }
}
