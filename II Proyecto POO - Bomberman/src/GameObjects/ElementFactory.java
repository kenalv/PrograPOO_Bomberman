/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import javax.swing.JRadioButton;

/**
 *
 * @author Kenneth
 */
public class ElementFactory extends javax.swing.JRadioButton implements ElementFactoryMethod  {
        
    JRadioButton jRadioButton1,jRadioButton2,jRadioButton3;
    int i;
    
    public ElementFactory(JRadioButton jRadioButton1,JRadioButton jRadioButton2,JRadioButton jRadioButton3){
        this.jRadioButton1 = jRadioButton1;
        this.jRadioButton2 =  jRadioButton2;
        this.jRadioButton3 = jRadioButton3;       
    }


    public Element newObject (String nombre, int id){
        if(jRadioButton1.isSelected()==true){
            return new Baloon(nombre,id);
        }
        if(jRadioButton2.isSelected()==true){
            return new Barrel(nombre,id);
            
        }
        if(jRadioButton3.isSelected()==true){
            return new Barrel(nombre,id);
        }
        return null;
    }
    
    
}
