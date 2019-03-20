package com.vonzhou.learningjava12;

/**
 * @author vonzhou
 * @date 2019/3/20
 */
public class SwitchDemo {
    public static void main(String[] args) {
        WeekDay day = WeekDay.MONDAY;
        switchStatement(day);
        day = WeekDay.WEDNESDAY;
        switchExpression(day);
        day = WeekDay.SATURDAY;
        switchExpressionBreakReturn(day);

    }

    private static void switchStatement(WeekDay day) {
        int numLetters = 0;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                numLetters = 8;
                break;
            case WEDNESDAY:
                numLetters = 9;
                break;
        }
        System.out.println("1. Num Of Letters: " + numLetters);
    }

    private static void switchExpression(WeekDay day) {
        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        };

        System.out.println("2. Num Of Letters: " + numLetters);
    }

    private static void switchExpressionBreakReturn(WeekDay day) {
        int numLetters = switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                break 6;
            case TUESDAY:
                break 7;
            case THURSDAY:
            case SATURDAY:
                numLetters = 8;
                break 8;
            case WEDNESDAY:
                break 9;
        };

        System.out.println("3. Num Of Letters: " + numLetters);
    }


    enum WeekDay {
        MONDAY,
        FRIDAY,
        SUNDAY,
        TUESDAY,
        THURSDAY,
        SATURDAY,
        WEDNESDAY
    }

}
