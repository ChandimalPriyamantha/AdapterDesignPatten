public class Controller {

    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(5);

        // Commented out the direct attempt to fit square pegs into round holes
        // roundHole.fits(new SquarePeg(2)); // This won't work

        // Using SquarePegAdapter to fit square pegs into round holes
        SquarePegAdapter adapter = new SquarePegAdapter(new SquarePeg(2));
        if (roundHole.fits(adapter)) {
            System.out.println("Square peg with width 2 fits into round hole with radius 5.");
        } else {
            System.out.println("Square peg with width 2 does not fit into round hole with radius 5.");
        }

    }
}
