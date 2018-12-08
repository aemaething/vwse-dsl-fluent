package com.aemaething.vwse.dsl.fluent;

/**
 * An example implementation of a fluent interface.
 *
 * @author Achim Gosse
 */
public class Dialog {

    /**
     * X pos of dialog.
     */
    private int posX;

    /**
     * Y pos of dialog.
     */
    private int posY;

    /**
     * Width of dialog.
     */
    private int width;

    /**
     * Height of dialog.
     */
    private int height;

    /**
     * Title of dialog.
     */
    private String title;

    /**
     * Content of dialog.
     */
    private String content;


    /**
     * Please use {@link #create()} to create an instance.
     */
    private Dialog() {
    }

    /**
     * Factory.
     *
     * @return Instance of Dialog
     */
    public static Dialog create() {
        return new Dialog();
    }

    /**
     * Fluent setter of x.
     *
     * @param x x-pos
     * @return current dialog
     */
    public Dialog atPosX(int x) {
        posX = x;
        return this;
    }

    /**
     * Fluent setter of y.
     *
     * @param y y-pos
     * @return current dialog
     */
    public Dialog atPosY(int y) {
        posY = y;
        return this;
    }

    /**
     * Fluent setter of width.
     *
     * @param w width
     * @return current dialog
     */
    public Dialog width(int w) {
        width = w;
        return this;
    }

    /**
     * Fluent setter of height.
     *
     * @param h height
     * @return current dialog
     */
    public Dialog height(int h) {
        height = h;
        return this;
    }

    /**
     * Fluent setter of title.
     *
     * @param t title
     * @return current dialog
     */
    public Dialog withTitle(String t) {
        title = t;
        return this;
    }

    /**
     * Fluent setter of content.
     *
     * @param c content
     * @return current dialog
     */
    public Dialog withContent(String c) {
        content = c;
        return this;
    }

    /**
     * Creates string representation.
     * @return string representation
     */
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
