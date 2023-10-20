package edu.hw1;

public class Task6 {

    private final static Integer INF_OF_CORRECT_NUMBER = 1001;
    private final static Integer SUP_OF_CORRECT_NUMBER = 9998;
    private final static Integer KAPREKAR_CONSTANT = 6174;
    private final static Byte THERE_IS_INCORRECT_NUMBER = -1;
    private final static Byte CORRECT_COUNT_OF_DIGITS = 4;
    private final static Byte DECIMAL_RADIX = 10;


    public int countK(int num) {
        if ((num < INF_OF_CORRECT_NUMBER) || (num > SUP_OF_CORRECT_NUMBER)) {
            return THERE_IS_INCORRECT_NUMBER;
        }
        if (num == KAPREKAR_CONSTANT) {
            return 0;
        }

        int numCopy = num;

        int[] numInArray = new int[CORRECT_COUNT_OF_DIGITS];

        for (int i = 0; i < CORRECT_COUNT_OF_DIGITS; ++i) {
            numInArray[i] = numCopy % DECIMAL_RADIX;
            numCopy /= DECIMAL_RADIX;
        }
        for (int i = 0; i < CORRECT_COUNT_OF_DIGITS; ++i) {
            for (int j = 0; j < CORRECT_COUNT_OF_DIGITS; ++j) {
                if (numInArray[i] > numInArray[j]) {
                    int buf = numInArray[i];
                    numInArray[i] = numInArray[j];
                    numInArray[j] = buf;
                }
            }
        }
        numCopy = 0;
        for (int i = 0; i < CORRECT_COUNT_OF_DIGITS; ++i) {
            numCopy *= DECIMAL_RADIX;
            numCopy += numInArray[i];
        }

        int numReversed = 0;
        for (int i = CORRECT_COUNT_OF_DIGITS - 1; i >= 0; --i) {
            numReversed *= DECIMAL_RADIX;
            numReversed += numInArray[i];
        }

        if (numCopy == numReversed) {
            return THERE_IS_INCORRECT_NUMBER;
        } else if (numCopy > numReversed) {
            numCopy = numCopy - numReversed;
        } else {
            numCopy = numReversed - numCopy;
        }
        return countK(numCopy) + 1;
    }
}
