/*
    Problem -
    Solution -
    Time Complexity -
    Space Complexity -
 */


package SOLID.OpenClosed.Refactored;

public class AreaCalculator {

    public double calculateArea(Shape[] shapes) throws Exception {

        double totalArea = 0;
        for (Shape shape : shapes) {
            shape.calculateArea(); // No modification required in calculateArea() method
                                   // of AreaCalculator for new Shape in future, so closed to modification
        }

        return totalArea;
    }
}
