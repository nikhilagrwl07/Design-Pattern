/*
    Problem -
    Solution -
    Time Complexity -
    Space Complexity -
 */


package SOLID.OpenClosed.Refactored;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
