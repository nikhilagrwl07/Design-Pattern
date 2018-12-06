package SOLID.OpenClosed;

public class Square implements Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return this.side*this.side;
    }
}
