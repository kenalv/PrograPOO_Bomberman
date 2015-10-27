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
public class Block extends Element{

    public Block(String nameObject, int idObject) {
        super(nameObject, idObject);
    }
        @Override
    public void CreateElement() {
        
    }
        @Override
    public String Description(){
        return "Soy un bloque, aveces te doy sorpresas...";
    }
}
