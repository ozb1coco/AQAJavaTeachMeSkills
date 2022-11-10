package TeachMeSkills.com.Lesson9.HomeWork;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {

        String text = "London is the capital of great Britain";
        System.out.println(text.charAt(text.length() - 1));
        System.out.println(text.endsWith("!!!"));
        System.out.println(text.startsWith("I like"));
        System.out.println(text.contains("java"));
        System.out.println(text.indexOf("java"));
        System.out.println(text.replace('a', 'o'));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.substring(7,11));
        Methods methods = new Methods();
        System.out.println(methods.polindromWords(text));
        methods.printWordFrom3to5Symbols(text);
        methods.maxWord(text);
        methods.minWord(text);
        StringBuilder sb = new StringBuilder("3 +").append(" 56 ").append("= 59");;
        System.out.println(sb);
        sb = new StringBuilder("3 -").append(" 56 =").append(" - 53");
        System.out.println(sb);
        sb = new StringBuilder("3 *").append(" 56").append(" = 168");
        System.out.println(sb);
        methods.createWordWithTwoHalfEvenWords();
    }
}
