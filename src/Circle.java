public class Circle extends Shape  implements Square {
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public String getName() {
        return "Circle";
    }

    private int radius;

    public int getRadius() {
        return radius;
    }



    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        // площя кола  дорівнюе добутку квадрата радиусу на число пі.
        return Math.PI * (radius * radius);
    }
}
