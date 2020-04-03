package com.otavioprado;

public class SwitchExpression {

    public static void main(String[] args) {
        int x = 10;;
        var var = "";

        int y = switch (x) {
            case 10, 20 -> {
                if(10 == x) {
                    yield 0;
                }
                yield 100;
            }
            case 30 -> 30;
            default -> throw new RuntimeException();
        };
        System.out.println(y);

        int z = switch (x) {
            case 10, 20, 30: yield 100;
            default: {
                System.out.println("Error");
                throw new RuntimeException();
            }
        };
        System.out.println(z);
    }
}