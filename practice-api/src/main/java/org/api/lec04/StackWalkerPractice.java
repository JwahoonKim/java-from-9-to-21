package org.api.lec04;

public class StackWalkerPractice {

    public static void main(String[] args) {
        callA();
    }

    private static void callA() {
        callB();
    }

    private static void callB() {
        callC();
    }

    private static void callC() {
        StackWalker.getInstance()
            .forEach(stack -> System.out.println(stack.getMethodName()));
    }

}
