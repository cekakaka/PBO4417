/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt_textfield;
import java.awt.*;
/**
 *
 * @author Lenovo
 */
public class Awt_textField {
    
    
    public static void main(String[] args) {
        
        Frame f = new Frame("Text Field Example");
        TextField t1,t2;
        t1 = new TextField("Welcome First AWT TextField");
        t1.setBounds(50,50,400,30);
        t2 = new TextField("AWT TEXT FIELD");
        t2.setBounds(50,100,400,30);
        // add
        f.add(t1);
        f.add(t2);
        f.setSize(600,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
