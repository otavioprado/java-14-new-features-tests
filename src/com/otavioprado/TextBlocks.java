package com.otavioprado;

public class TextBlocks {

    public static void main(String[] args) {
        String s1 = """
            <html>
                <head></head>
                <body>
                    <p>Hello, world</p>
                </body>
            </html>
            """;

        System.out.println(s1);

        String s2 = """
            """;

        System.out.println(">" + s2);
    }
}
