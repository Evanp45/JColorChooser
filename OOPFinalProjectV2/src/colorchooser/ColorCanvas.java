/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser; 

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Evan
 */
public class ColorCanvas extends JPanel implements ColorListener {
    public ColorCanvas(){
        super();
        setBackground(java.awt.Color.BLACK);
    }
    @Override
    public void changeColor(ColorEvent ce) {
        setBackground(ce.getColor());
    }
    public void setColor(Color color) {  
        this.setBackground(color); 
    }
}
