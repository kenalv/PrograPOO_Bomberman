/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

/**
 *
 * @author Kenneth
 */
public class Baloon extends Element {

    public Baloon(String nameObject, int idObject) {
        super(nameObject, idObject);
    }

    @Override
    public void CreateElement() {
        
    }
    @Override
    public String Description(){
        return "Soy un baloon";
    }
    
    
}
