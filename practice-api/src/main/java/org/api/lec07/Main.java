package org.api.lec07;

public class Main {

    public static void main(String[] args) {
        stripPractice();

    }

    private static void stripPractice() {
        String str = "  A BC  ";
        System.out.println("str.strip() = " + str.strip()); // "A BC"
        System.out.println("str.stripTrailing() = " + str.stripTrailing()); // "  A BC"
        System.out.println("str.stripLeading() = " + str.stripLeading());   // "A BC  "
    }

}
