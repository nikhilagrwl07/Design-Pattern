/*
    Problem -
    Solution -
    Time Complexity -
    Space Complexity -
 */


package SOLID.OpenClosed.Raw;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    //    public double calculateArea() {
//        return length * width;
//    }
}
