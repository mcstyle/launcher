package net.launcher.theme;

import java.awt.Color;

import javax.swing.border.EmptyBorder;

import net.launcher.components.Align;
import net.launcher.components.ButtonStyle;
import net.launcher.components.ComponentStyle;
import net.launcher.components.PassfieldStyle;
import net.launcher.components.TextfieldStyle;

public class RegTheme {
    public static TextfieldStyle loginReg = new TextfieldStyle(48, 220, 265, 32, "input-def-craftorio", "font", 14F, Color.decode("0xFFFFFF"), Color.decode("0xFFFFFF"), new EmptyBorder(0, 10, 0, 10));
    public static PassfieldStyle passwordReg = new PassfieldStyle(48, 269, 265, 32, "input-def-craftorio", "font", 14F, Color.decode("0xFFFFFF"), Color.decode("0xFFFFFF"), "1", new EmptyBorder(0, 10, 0, 10));
    public static PassfieldStyle password2Reg = new PassfieldStyle(48, 318, 265, 32, "input-def-craftorio", "font", 14F, Color.decode("0xFFFFFF"), Color.decode("0xFFFFFF"), "1", new EmptyBorder(0, 10, 0, 10));
    public static TextfieldStyle mailReg = new TextfieldStyle(48, 367, 265, 32, "input-def-craftorio", "font", 14F, Color.decode("0xFFFFFF"), Color.decode("0xFFFFFF"), new EmptyBorder(0, 10, 0, 10));

    public static ComponentStyle textloginReg = new ComponentStyle(145, 168, -1, -1, "font", 16F, Color.WHITE, true);
    public static ComponentStyle textpasswordReg = new ComponentStyle(145, 212, -1, -1, "font", 16F, Color.WHITE, true);
    public static ComponentStyle textpassword2Reg = new ComponentStyle(145, 258, -1, -1, "font", 16F, Color.WHITE, true);
    public static ComponentStyle textmailReg = new ComponentStyle(145, 304, -1, -1, "font", 16F, Color.WHITE, true);

    public static ButtonStyle okreg = new ButtonStyle(48, 417, 127, 37, "font", "button1-craftorio", 14F, Color.decode("0xFFFFFF"), true, Align.CENTER);
    public static ButtonStyle closereg = new ButtonStyle(184, 416, 127, 37, "font", "button2-craftorio", 14F, Color.decode("0xFFFFFF"), true, Align.CENTER);


    public static int titleRegX = 190;
    public static int titleRegY = 150;
}