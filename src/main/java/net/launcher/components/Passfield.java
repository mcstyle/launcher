package net.launcher.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;

import javax.swing.JPasswordField;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

import net.launcher.run.Settings;
import net.launcher.theme.Message;
import net.launcher.utils.BaseUtils;
import net.launcher.utils.ImageUtils;

import static net.launcher.utils.BaseUtils.empty;

public class Passfield extends JPasswordField
    implements FocusListener
{
    private static final long serialVersionUID = 1L;
    private String placeholderText = "";
    private Color placeholderTextColor = Color.decode("0x777777");
    private Boolean isFirstPaint = true;

    public void setPlaceholderText(String text) {
        placeholderText = text;
    }

    public void setPlaceholderTextColot(Color color) {
        placeholderTextColor = color;
    }

    public BufferedImage texture;

    public Passfield() {
        setOpaque(false);
        addFocusListener(this);
    }

    public void paintInitialize()
    {
        setText(placeholderText);
        setForeground(placeholderTextColor);
        setEchoChar((char) 0);
    }

    protected void paintComponent(Graphics maing) {
        Graphics2D g = (Graphics2D) maing.create();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //g.drawImage(ImageUtils.genButton(getWidth(), getHeight(), texture), 0, 0, getWidth(), getHeight(), null);
        g.drawImage(texture, 0, 0, getWidth(), getHeight(), null);
        if (Settings.drawTracers) {
            g.setColor(Color.PINK);
            g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        }
        g.dispose();

        if (isFirstPaint) {
            paintInitialize();
            isFirstPaint = false;
        }

        super.paintComponent(maing);
    }

    public void focusGained(FocusEvent e) {
        Document doc = getDocument();
        String value = "";
        try {
            value = doc.getText(0, doc.getLength());
        } catch (BadLocationException ex) {

        }

        if (value.equals(placeholderText)) {
            setEchoChar('*');
            setText("");
            setForeground(Color.white);
        }
    }

    public void focusLost(FocusEvent e) {
        Document doc = getDocument();
        String value = "";
        try {
            value = doc.getText(0, doc.getLength());
        } catch (BadLocationException ex) {

        }

        if (value.equals("")) {
            setEchoChar((char) 0);
            setText(placeholderText);
            setForeground(placeholderTextColor);
        }
    }
}