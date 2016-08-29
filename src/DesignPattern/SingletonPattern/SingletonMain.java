/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.SingletonPattern;

/**
 *
 * @author nikhil.agrawal
 */
public class SingletonMain 
{
     public static void main(String[] args) 
     {
         
     Singleton singleton = Singleton.singleton;
     
     singleton.showMessage();
     
     
    }


}
