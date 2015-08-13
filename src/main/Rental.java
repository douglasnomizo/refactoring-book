public class Rental {

    Movie _movie;
    private int _daysRented;
    private int frequentRenterPoints;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getFrequentRenterPoints() {
        return _movie._price.getFrequentRenterPoints(_daysRented, _movie);
    }
}
