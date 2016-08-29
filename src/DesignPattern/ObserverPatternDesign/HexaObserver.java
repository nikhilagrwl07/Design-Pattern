/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.ObserverPatternDesign;

public class HexaObserver extends Observer{

   public HexaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}
