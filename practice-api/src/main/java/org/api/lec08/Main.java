package org.api.lec08;

public class Main {

    public static void main(String[] args) {
        switchExpression(args);
        instanceofPatternMatching();
    }

    private static int switchExpression(String[] args) {
        return switch (args.length) {
            case 0 -> 0;
            case 1 -> 1;
            default -> throw new IllegalArgumentException("Invalid argument");
        };
    }

    private static void instanceofPatternMatching() {
        Object object = new Object();
        if (object instanceof String s) {
            System.out.println("s = " + s);
        }
    }

}
