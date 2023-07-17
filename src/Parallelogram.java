public class Parallelogram extends Shape implements Square{
    public Parallelogram(int parallelogramSide, int parallelogramHeight) {
        this.parallelogramSide = parallelogramSide;
        this.parallelogramHeight = parallelogramHeight;
    }

    public Parallelogram(int parallelogramSide) {
        this.parallelogramSide = parallelogramSide;
    }
    private int parallelogramSide;
    private int parallelogramHeight;

    public int getParallelogramHeight() {
        return parallelogramHeight;
    }

    public void setParallelogramHeight(int parallelogramHeight) {
        this.parallelogramHeight = parallelogramHeight;
    }

    public int getParallelogramSide() {
        return parallelogramSide;
    }

    public void setParallelogramSide(int parallelogramSide) {
        this.parallelogramSide = parallelogramSide;
    }

    @Override
    public String getName() {
        return "Parallelogram";
    }



    // Площа паралелограма дорівнює добутку довжини його сторони на довжину опущеної в цю сторону висоти.
    @Override
    public double calcSquare() {
        return parallelogramHeight * parallelogramSide;
    }
}
