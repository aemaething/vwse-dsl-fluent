package com.aemaething.vwse.dsl;

import com.aemaething.vwse.dsl.fluent.Dialog;
import junit.framework.TestCase;

public class DialogTest extends TestCase {

    public void testDialog() {
        Dialog d = Dialog
                .create()
                .atPosX(0)
                .atPosY(0)
                .width(640)
                .height(480)
                .withTitle("Attention please")
                .withContent("Hello, World");

        assertEquals(
                "com.aemaething.vwse.fluent.Dialog{posX=0, posY=0, width=640, height=480, title='Attention please', content='Hello, World'}",
                d.toString()
                );
    }
}
