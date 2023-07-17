public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(6);
        Shape quad = new Quad(4);
        Shape romb = new Romb(6,7);
        Shape rectangle = new Rectangle(5,3);
        Shape parallelogram = new Parallelogram(4,5);

        ShapePrinter shapePrinter = new ShapePrinter();

        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(quad);
        shapePrinter.printShapeName(romb);
        shapePrinter.printShapeName(rectangle);
        shapePrinter.printShapeName(parallelogram);
        Square[] squares = new Square[5];
        squares[0] = new Quad(4);
        squares[1] = new Circle(6);
        squares[2] = new Romb(6,7);
        squares[3] = new Rectangle(5,3);
        squares[4] = new Parallelogram(4,5);

        for (int i = 0; i < squares.length; i++) {
            Shape shape = (Shape) squares[i];
            System.out.println("Figure: " + shape.getName() + ", Square: " + squares[i].calcSquare());
        }



    }
}