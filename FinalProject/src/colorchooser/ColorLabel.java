/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import javax.swing.JLabel;

/**
 *
 * @author nccmac
 */
public class ColorLabel extends JLabel implements ColorListener {
    
    public ColorLabel(){
        super();
        setText("#000000");
    }

    @Override
    public void changeColor(ColorEvent ce) {
        int red = ce.getColor().getRed();
        int green = ce.getColor().getGreen();
        int blue = ce.getColor().getBlue();
        
        String HexString = String.format("#%02X%02X%02X", red, green, blue);
        setText(HexString);
    }
    
}
