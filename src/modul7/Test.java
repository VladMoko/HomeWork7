package modul7;

public class Test{
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape cone = new Cone();

        Main main = new Main();
        main.getShape(shape);
        main.getShape(square);
        main.getShape(triangle);
        main.getShape(rectangle);
        main.getShape(cone);
    }
}
