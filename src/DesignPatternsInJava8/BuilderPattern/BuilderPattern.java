package DesignPatternsInJava8.BuilderPattern;

import java.util.function.Consumer;

/**
 * @author Nikhil Agrawal on 5/19/17.
 */

// Aim of this class - this class shows builder pattern / Creating fluent interfaces using lambdas - cascade method
class Mailer{

  private static void printContent(String content) {
    System.out.println(content);
  }
     Mailer from(String from){printContent(from); return this;}
     Mailer to(String to ){printContent(to); return this;}
     Mailer subject(String line){printContent(line); return this;}
     Mailer body(String mesaageBody ){printContent(mesaageBody); return this;}

  static void send(Consumer<Mailer> mailerConsumer)
    {
      Mailer mailer = new Mailer();
      mailerConsumer.accept(mailer);
      printContent("...sending...");
    }

}


class BuilderPattern {
  public static void main(String[] args) {
    Mailer.send(mailer -> mailer
                            .from("nikhil.agrwl07@gmail.com")
                            .to("ritu@gmail.com")
                            .subject("I am new to FP")
                            .body(".........here you go ........"));

  }
}
