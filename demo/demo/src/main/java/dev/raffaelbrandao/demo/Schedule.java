package dev.raffaelbrandao.demo;

public class Schedule {
    public static int MAX = 2280;

    public Schedule() {

    }

    private void addFirstDay() {
        DayOfWeek fistDayOfWeek = DayOfWeek.MONDAY;
    }

    private void addTask(DayOfWeek day) {
        switch (day) {
            case MONDAY:
                addFirstDay();
                break;
            case THURSDAY:
                break;
        }
    }
}