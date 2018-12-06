package SOLID.OpenClosed;

public class OpenClosedPrincipleDriver {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10,20);
        Shape square = new Square(10);
        Shape circle = new Circle(5);
        Shape[] shapes = {rectangle, square,circle};

        OpenClosedPrincipleDriver openClosedPrincipleDriver = new OpenClosedPrincipleDriver();
        openClosedPrincipleDriver.calculateAreaOfShapes(shapes);

    }

    public void calculateAreaOfShapes(Shape[] shapes){
        for(Shape shape: shapes){
            int area = shape.calculateArea();
            System.out.println(area);
        }
    }
}
