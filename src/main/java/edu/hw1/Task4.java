package edu.hw1;

public class Task4 {
    public String fixString(String str) {
        String fixedStr = "";
        for (int i = 1; i < str.length(); i += 2) {
            fixedStr += str.charAt(i);
            fixedStr += str.charAt(i - 1);
        }
        if (str.length() % 2 == 1) {
            fixedStr += str.charAt(str.length() - 1);
        }

        return fixedStr;
    }
}
