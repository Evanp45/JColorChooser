/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colorchooser;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.util.ArrayList;

/**
 *
 * @author Evan
 */
public class JColorNumberField extends JTextField implements ColorListener {
    private ArrayList<ColorListener> listeners;

    public JColorNumberField() {
        super();
        setDocument(new NumericDocument());
        setText("0");
        listeners = new ArrayList<>();
    }
    @Override
    public void changeColor(ColorEvent ce) {
    }

    public int getValue() throws NumberFormatException {
        return Integer.parseInt(getText());
    }

    private static class NumericDocument extends PlainDocument {
        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (str == null) {
                return;
            }
            char[] chars = str.toCharArray();
            boolean isValid = true;
            for (char c : chars) {
                if (!Character.isDigit(c) && c != '-') {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                super.insertString(offs, str, a);
            }
        }
    }
}