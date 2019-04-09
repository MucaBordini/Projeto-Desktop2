/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

/**
 *
 * @author julio
 */
public class CarregarFontes {
    Font roboto = null;
    public Font getFonte() throws FontFormatException, IOException{  
    
        roboto = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("/fontes/Roboto-Regular.ttf"));
   
        roboto = roboto.deriveFont(Font.PLAIN, 20);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(roboto);  
        
    return roboto;  
} 

}
