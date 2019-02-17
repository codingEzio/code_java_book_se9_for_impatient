package ch01.sec01;

public class ExpEnum {

    private enum WEEKDAY {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,
    };

    public static void main(String[] args) {

        final int DAYS_PER_WEEK = 7;

        System.out.println(DAYS_PER_WEEK);
        System.out.println(WEEKDAY.MONDAY);
    }
}