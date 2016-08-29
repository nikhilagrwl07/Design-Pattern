/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.ObserverPatternDesign;

public class OctalObserver extends Observer{

   public OctalObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
   }
}
