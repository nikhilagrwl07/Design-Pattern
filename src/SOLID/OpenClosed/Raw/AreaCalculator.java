/*
    Problem -
    Solution -
    Time Complexity -
    Space Complexity -
 */


package SOLID.OpenClosed.Raw;

public class AreaCalculator {

    public double calculateArea(Shape[] shapes) throws Exception {

        double totalArea = 0;
        for (Shape shape : shapes) {

            if (shape instanceof Rectangle) {
                Rectangle rec = (Rectangle) shape;
                totalArea += rec.getLength() * rec.getWidth();
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                totalArea += Math.PI * circle.getRadius();
            } else {
                throw new Exception("Unsupported Shape Passed!");
            } // If new shape are added then we have to touch calculateArea() method of
            //  areaCalculator class which is isn't closed to modification as we are modifying it
        }

        return totalArea;
    }
}
