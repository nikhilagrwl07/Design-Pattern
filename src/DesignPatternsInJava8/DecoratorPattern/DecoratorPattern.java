package DesignPatternsInJava8.DecoratorPattern;

import java.awt.*;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author Nikhil Agrawal on 5/18/17.
 */

@SuppressWarnings("unchecked")
class Camera{

  private Function<Color,Color> filter;

   Camera(Function<Color, Color>... filters) {
    setFilters(filters);
  }

  private void setFilters(Function<Color, Color>... filters){
    // This is basic version
    //filter=color -> color;

    // This is advanced feature
       filter= Stream.of(filters)
            .reduce(Function.identity(), Function::andThen);

  }

   Color snap(Color input){
    return filter.apply(input);
  }
}

@SuppressWarnings("unchecked")
public class DecoratorPattern {

  public static void main(String[] args) {
    printSnap(new Camera());

    printSnap(new Camera(Color::brighter));

    printSnap(new Camera(Color::darker));

    printSnap(new Camera(Color::brighter , Color::darker));
  }
   private static void printSnap(Camera camera){
    System.out.println(camera.snap(new Color(125,125,125)));
  }
}
