public class Rectangle extends Shape implements Square{

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    private int sideA;
    private int sideB;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    //Площа прямокутника дорівнює добутку довжин двох сусідніх його сторін
    @Override
    public double calcSquare() {
        return sideA * sideB;
    }
}
