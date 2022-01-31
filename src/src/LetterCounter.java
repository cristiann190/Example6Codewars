package src;

public class LetterCounter {
    public static boolean getXO (String str) {
        int numberOfO = str.replaceAll("(?i)[^o]", "").length();
        int numberOfX = str.replaceAll("(?i)[^x]", "").length();
        return numberOfO == numberOfX;
    }


    public static boolean getXOOptimized (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();

    }
}