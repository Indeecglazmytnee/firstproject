public class Romb extends Shape  implements Square{
    public Romb(int rombSide, int rombHeight) {
        this.rombSide = rombSide;
        this.rombHeight = rombHeight;
    }

    private int rombSide;
    private int rombHeight;

    public int getRombSide() {
        return rombSide;
    }

    public void setRombSide(int rombSide) {
        this.rombSide = rombSide;
    }

    public int getRombHeight() {
        return rombHeight;
    }

    public void setRombHeight(int       rombHeight) {
        this.rombHeight = rombHeight;
    }

    @Override
    public String getName() {
        return "Romb";
    }

    //Площа ромба - це добуток довжини його сторони на довжину опущеної в ту сторону висоти
    @Override
    public double calcSquare() {
        return rombSide * rombHeight;
    }
}
