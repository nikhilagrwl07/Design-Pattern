package DesignPatternsInJava8;

import java.util.Arrays;
import java.util.List;

/**
 * @author Nikhil Agrawal on 5/17/17.
 */
public class InternalIteratorPattern {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    //Using internal iterator design pattern to focus more on logic
    numbers.forEach(System.out::println);

  }
}
