package modul7;

public class Test{
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape shape1 = new Square();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape cone = new Cone();

        shape.getShape(shape);
        shape1.getShape(shape1);
        triangle.getShape(triangle);
        rectangle.getShape(rectangle);
        cone.getShape(cone);
    }
}
