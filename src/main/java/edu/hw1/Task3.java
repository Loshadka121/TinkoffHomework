package edu.hw1;

public class Task3 {
    public boolean isNestable(int[] arr1, int[] arr2) {
        if ((arr1.length == 0) || (arr2.length == 0)) {
            return false;
        }
        int max1 = 0;
        for (int i = 0; i < arr1.length; ++i) {
            if (arr1[i] > max1) {
                max1 = arr1[i];
            }
        }
        int max2 = 0;
        for (int i = 0; i < arr2.length; ++i) {
            if (arr2[i] > max2) {
                max2 = arr2[i];
            }
        }

        if (max1 >= max2) {
            return false;
        }

        int min1 = max1 + 1;
        for (int i = 0; i < arr1.length; ++i) {
            if (arr1[i] < min1) {
                min1 = arr1[i];
            }
        }
        int min2 = max2 + 1;
        for (int i = 0; i < arr2.length; ++i) {
            if (arr2[i] < min2) {
                min2 = arr2[i];
            }
        }

        return (min1 > min2);
    }
}
