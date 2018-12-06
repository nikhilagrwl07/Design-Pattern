package SOLID.OpenClosed;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius=radius;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI*Math.sqrt((double) radius));
    }
}
