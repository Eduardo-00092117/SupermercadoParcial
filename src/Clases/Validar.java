package Clases;




import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UCA
 */
public class Validar {
    Character s;
    
    public void soloLetras(KeyEvent evt){
        s = evt.getKeyChar();
        if(!Character.isLetter(s)){
            evt.consume();
        }
        
        
    }
    public void soloNumeros(KeyEvent evt){
        s = evt.getKeyChar();
        if(!Character.isDigit(s)){
            evt.consume();
        }
        
        
    }
    
}
