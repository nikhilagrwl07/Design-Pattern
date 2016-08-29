/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.SingletonPattern;

/**
 *
 * @author nikhil.agrawal
 */


public class Singleton {
    
    public static Singleton singleton = new Singleton();

    private Singleton() {
        
    }
    public void showMessage(){
        
        System.out.println("Inside Singleton Class");
    }
    
}
