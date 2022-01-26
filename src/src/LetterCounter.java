package src;

public class LetterCounter {
    public static boolean getXO (String str) {
        int numberOfO = str.replaceAll("(?i)[^o]", "").length();
        int numberOfX = str.replaceAll("(?i)[^x]", "").length();
        return numberOfO == numberOfX;
    }
}