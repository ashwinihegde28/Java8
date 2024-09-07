package org.example.String;

public class MakeTags {
    public static void main(String[] args) {

        System.out.println(makeTags("i","hello"));
    }
    public static  String makeTags(String tag, String word) {

        String result = "<" + tag + ">" + word + "</" + tag + ">";
        return "makeTags(" + "\"" + tag + "\", \"" + word + "\") → \"" + result + "\"";


    }
}
