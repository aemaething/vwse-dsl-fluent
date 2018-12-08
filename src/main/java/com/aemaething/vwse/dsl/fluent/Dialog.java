package com.aemaething.vwse.dsl.fluent;

public class Dialog {

    private int posX;

    private int posY;

    private int width;

    private int height;

    private String title;

    private String content;


    private Dialog() {
    }

    public static Dialog create() {
        return new Dialog();
    }

    public Dialog atPosX(int x) {
        posX = x;
        return this;
    }

    public Dialog atPosY(int y) {
        posY = y;
        return this;
    }

    public Dialog width(int w) {
        width = w;
        return this;
    }

    public Dialog height(int h) {
        height = h;
        return this;
    }

    public Dialog withTitle(String t) {
        title = t;
        return this;
    }

    public Dialog withContent(String c) {
        content = c;
        return this;
    }

    @Override
    public String toString() {
        return "com.aemaething.vwse.fluent.Dialog{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", width=" + width +
                ", height=" + height +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
