package ro.fasttrackit.course11.code.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Ana are 20 de mere merisoare.";

        // replace character(s)
        System.out.println(text.replaceAll("[am]", "*"));

        // replace characters that do not match  --> ^ not
        System.out.println(text.replaceAll("[^am ]", "*"));

        // characters from range
        System.out.println(text.replaceAll("[A-Z]", "*"));  // uppercase letters
        System.out.println(text.replaceAll("[a-z]", "*"));  //
        System.out.println(text.replaceAll("[A-z]", "*"));

        // mentioned characters
        System.out.println(text.replaceAll("(eri|ere)", "*"));
        System.out.println(text.replaceAll("[easi]", "*"));

        // replace any character
        System.out.println(text.replaceAll(".", "*"));

        System.out.println(text.replaceAll("[.]", "*"));

        // replace any digit
        System.out.println(text.replaceAll("\\d", "*"));


        // validations with regex
        // * --> 0 or multiple times
        // + -> 1 or multiple times
        System.out.println(Pattern.matches("A.*", text));
        System.out.println(Pattern.matches("A.*", "A"));
        System.out.println(Pattern.matches("A.+", "A"));

        List<Integer> list = Arrays.asList(1, 2, 5, 4, 3, 1);

        varArgs("test1", 1,3,5);
        varArgs("tes2", 2,4,6);
    }

    private static void varArgs(String firstParam, Integer... numbers) { // varargs always at the end of param list
        for (Integer number : numbers) {
            System.out.println(firstParam + " = " + number);
        }
    }
}
