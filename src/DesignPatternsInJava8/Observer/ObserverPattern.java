package DesignPatternsInJava8.Observer;

import java.util.function.Function;

/**
 * @author Nikhil Agrawal on 5/18/17.
 */
public class ObserverPattern {
  public static void main(String[] args) {
    Function<String, Integer> stringLength = String::length;
    Function<Integer, Boolean> lowerThanTen = (i) -> i < 10;

    Function<String, Boolean> function = stringLength.andThen(lowerThanTen);
    System.out.println(function.apply("Hello world"));
  }
}
