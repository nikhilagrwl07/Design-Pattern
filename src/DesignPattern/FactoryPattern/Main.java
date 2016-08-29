
package DesignPattern.FactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nikhil.agrawal
 */
public class Main {
     
    public static void main(String[] args) throws IOException {
        
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Please type of shape :: ");

            String userInput = br.readLine();
            
            
            
          //  Factory f = new Factory();
            Shape shape = Factory.getShape(userInput);
            shape.draw();
            
          
         
    }


}
