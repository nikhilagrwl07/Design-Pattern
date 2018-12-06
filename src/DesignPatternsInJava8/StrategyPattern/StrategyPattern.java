package DesignPatternsInJava8.StrategyPattern;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Nikhil Agrawal on 5/17/17.
 */

// Aim of this class - Dependency Injection can be achieved by using Strategy pattern.
// In this class we are trying out different predicate for summing values of n numbers
public class StrategyPattern {
  
  // In adddition to showing StrategyPattern In Java8 , it also shows internal iterator pattern
  //This example also shows object composition + function composition
  private static Integer returnSumOfNnumberUsingSomePredicate(List<Integer> numbers, Predicate<Integer> selector){
    return  numbers.stream()
          .filter(selector)
          .reduce(0,Math::addExact);   // we can use "reduce(0,Integer::sum);" in place of last line
  }

  public static void main(String[] args) {
    List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    // Rule to add all numbers present in list
    System.out.println(returnSumOfNnumberUsingSomePredicate(num,e->true));

    // Rule to add all only even numbers present in list
    System.out.println(returnSumOfNnumberUsingSomePredicate(num,e-> e%2==0));

    System.out.println(returnSumOfNnumberUsingSomePredicate(num,Util::isEven));
    System.out.println(returnSumOfNnumberUsingSomePredicate(num,Util::isOdd));

  }
}


class Util
{
  public static boolean isEven(int number){
    return number >1 && number %2 ==0;
  }

  public static boolean isOdd(int number){
    return number >1 && number %2 !=0;
  }
}
