package com.otavioprado;

/**
 * Add de VM Options below:
 * -XX:+ShowCodeDetailsInExceptionMessages
 */
public class HelpfulNullPointerException {

    public static void main(String[] args) {
        method1().method2().toString(); // NullPointerException

        System.out.println("hadouken");
    }

    private static HelpfulNullPointerException method1() {
        return new HelpfulNullPointerException();
    }

    private static HelpfulNullPointerException method2() {
        return null;
    }
}
