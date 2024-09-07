package org.example.String;

public class MakeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "bliss"));
    }

    public static String makeOutWord(String out, String word) {
        String s1 = "makeOutWord(\"";
        String s2 = out + "\", \"" + word;
        String s3 = "\") → \"";
        String s4 = out.substring(0, 2) + word + out.substring(2);
        return s1 + s2 + s3 + s4 + "\"";
    }
}
