package edu.hw1;

public class Task1 {

    private final static Byte MARGIN_FROM_END = 3;
    private final static Byte DECIMAL_RADIX = 10;
    private final static Byte SECONDS_IN_MINUTE = 60;
    private final static Byte INCORRECT_INPUT = -1;

    public int minutesToSeconds(String str) {
        int stopPosition = str.length() - MARGIN_FROM_END;
        for (int i = 0; i < str.length(); ++i) {
            if ((i != stopPosition) && !(Character.isDigit(str.charAt(i)))) {
                return INCORRECT_INPUT;
            }
            if ((i == stopPosition) && (str.charAt(i) != ':')) {
                return INCORRECT_INPUT;
            }
        }

        int seconds = 0;
        for (int i = stopPosition + 1; i < str.length(); ++i) {
            seconds *= DECIMAL_RADIX;
            seconds += Character.getNumericValue(str.charAt(i));
        }
        if (seconds >= SECONDS_IN_MINUTE) {
            return INCORRECT_INPUT;
        }

        int minutes = 0;
        for (int i = 0; i < stopPosition; ++i) {
            minutes *= DECIMAL_RADIX;
            minutes += Character.getNumericValue(str.charAt(i));
        }

        seconds += (minutes * SECONDS_IN_MINUTE);
        return seconds;
    }
}
