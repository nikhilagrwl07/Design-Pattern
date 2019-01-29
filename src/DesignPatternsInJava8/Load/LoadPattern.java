package DesignPatternsInJava8.Load;

import java.util.function.Consumer;

/**
 * @author Nikhil Agrawal on 5/19/17.
 */

//Loan pattern - using when we have to do some pre-processing and then some post-processing
public class LoadPattern {

  public static void main(String[] args) {

    ResourceInJava8.use(resource -> resource
                                    .printOP1()
                                    .printOP2());
  }
}


class ResourceInJava8{

  ResourceInJava8 printOP1(){
    System.out.println("op1......");
    return this;
  }

  ResourceInJava8 printOP2(){
    System.out.println("op2......"); return this;
  }



  public static void use(Consumer<ResourceInJava8> block){
    ResourceInJava8 resource = new ResourceInJava8();
  try {
      block.accept(resource);
    }
    finally {
      resource.close();
  }

  }

  public void close() {
    System.out.println("Cleaning .............");
  }
}
