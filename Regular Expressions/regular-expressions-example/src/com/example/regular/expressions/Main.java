package com.example.regular.expressions;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String alphanumeric = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        String hasWhitespace = "I have blanks and\ta tab, \nand also a newline";

        Map<String, String> regExpressions = new HashMap<>();
        regExpressions.put("^abcDeee", "*");
        regExpressions.put("ijkl99z$", "*");
        regExpressions.put("[aei]", "*");
        regExpressions.put("[aei][Fj]", "*");
        regExpressions.put("[^ej]", "*");
        regExpressions.put("[abcdef345678]", "*");
        regExpressions.put("[a-fA-F3-8]", "*");
        regExpressions.put("(?i)[a-f3-8]", "*");
        regExpressions.put("[0-9]", "*");
        regExpressions.put("\\D", "*");

        changeStringWithRegularExpression(alphanumeric, regExpressions);

        System.out.println("=======================================\n");

        regExpressions = new HashMap<>();
        regExpressions.put("\\s", "*");
        regExpressions.put("\t", "*");
        regExpressions.put("\\S", "*");
        regExpressions.put("\\w", "*");
        regExpressions.put("\\b", "*");

        changeStringWithRegularExpression(hasWhitespace, regExpressions);
    }

    public static void changeStringWithRegularExpression(String source, Map<String, String> expressions) {
        Iterator<Map.Entry<String, String>> it = expressions.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> exp = it.next();
            String newString = source.replaceAll(exp.getKey(), exp.getValue());
            System.out.format("Regex:\"%s\" Replacement:\"%s\"\nSource:[%s]\nResult:[%s]\n\n",
                    exp.getKey(), exp.getValue(), source, newString);
            it.remove();
        }
    }
}
