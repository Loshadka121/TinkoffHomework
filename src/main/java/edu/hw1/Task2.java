package edu.hw1;

public class Task2 {

    private final static Byte DECIMAL_RADIX = 10;
    private final static Byte CHANGE_A_SIGN = -1;

    public int countDigits(int num) {
        if (num == 0) {
            return 1;
        }
        int numCopy = num;
        if (numCopy < 0) {
            numCopy *= CHANGE_A_SIGN;
        }
        int digitCount = 0;
        while (numCopy > 0) {
            ++digitCount;
            numCopy /= DECIMAL_RADIX;
        }

        return digitCount;
    }
}
