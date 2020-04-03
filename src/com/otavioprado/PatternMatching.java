package com.otavioprado;

public class PatternMatching {

    public static void main(String[] args) {
        Number n = 10;

        if(n instanceof Integer i && i > 5) {
            System.out.println(i);
        }
    }
}
