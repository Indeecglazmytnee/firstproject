public class Quad extends Shape implements Square  {
    public Quad(int side) {
        this.side = side;
    }
    private int side;

    @Override
    public String getName() {
        return "Quad";
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    @Override
    public double calcSquare() {
        //площя квадрата дорівнюе квадрату його сторони
    return side * side;
    }
}
