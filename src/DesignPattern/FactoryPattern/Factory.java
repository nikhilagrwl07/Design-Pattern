/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.FactoryPattern;

/**
 *
 * @author nikhil.agrawal
 */
public class Factory {
    
    public static Shape getShape(String type){
        
        if(type.equalsIgnoreCase("circle"))
        {
            return new Circle();
        }
        else if(type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
        
    }

}
