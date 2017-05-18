package DesignPatternsInJava8.LoadPattern;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author Nikhil Agrawal on 5/19/17.
 */

// Java 7 has a features known as ARM - Automatic Resource Management
public class newPatternJava7 {

  public static void main(String[] args) {

    try(ResourceInJava7 resource = new ResourceInJava7()){
      resource.printOP1();
      resource.printOP2();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}

class ResourceInJava7 implements Closeable{

   void printOP1(){
    System.out.println("op1......");
  }

   void printOP2(){
    System.out.println("op2......");
  }

  @Override
  public void close() throws IOException {
    System.out.println("calling close()........");
  }

}
