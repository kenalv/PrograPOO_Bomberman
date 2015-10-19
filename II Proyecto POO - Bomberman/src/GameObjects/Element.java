/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

/**
 *
 * @author HP 15 P002LA
 */

/*The super clase element will represent each game object in the matrix, it 
just have the name of the object and an unique id */
public class Element {
    private String nameObject;
    private int idObject;

    public Element(String nameObject, int idObject) {
        this.nameObject = nameObject;
        this.idObject = idObject;
    }

    public String getNameObject() {
        return nameObject;
    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    public int getIdObject() {
        return idObject;
    }

    public void setIdObject(int idObject) {
        this.idObject = idObject;
    }
}
