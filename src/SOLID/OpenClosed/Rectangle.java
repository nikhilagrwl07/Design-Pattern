package SOLID.OpenClosed;

public class Rectangle implements Shape {
    private int length;
    private int breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public int calculateArea() {
        return this.length*this.breath;
    }
}
