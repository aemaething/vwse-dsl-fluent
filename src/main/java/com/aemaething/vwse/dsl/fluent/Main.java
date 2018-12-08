package com.aemaething.vwse.dsl.fluent;

/**
 * Starts the app.
 *
 * @author Achim Gosse
 */
public class Main {

    /**
     * Entry point of cli execution.
     *
     * @param args cli arguments - not needed
     */
    public static void main(String[] args) {
        Dialog d = Dialog
                .create()
                .atPosX(0)
                .atPosY(0)
                .width(640)
                .height(480)
                .withTitle("Attention please")
                .withContent("Hello, World");

        System.out.println(d);
    }
}
