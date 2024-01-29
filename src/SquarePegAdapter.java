public class SquarePegAdapter extends RoundPeg{

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth() * Math.sqrt(2)/2); // Circumscribe the square to get the equivalent radius
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }
}
