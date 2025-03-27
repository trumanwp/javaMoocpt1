
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int result = (pricePerSquare * squares) - (compared.pricePerSquare * compared.squares);

        if (result > 0) {
            return result;
        }
        return result * -1;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if ((pricePerSquare * squares) > (compared.pricePerSquare * compared.squares)) {
            return true;
        }
        return false;
    }

}
