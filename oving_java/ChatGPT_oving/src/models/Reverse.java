package models;

public class Reverse {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return ("Reversed: " + sb.reverse().toString());
    }
}
