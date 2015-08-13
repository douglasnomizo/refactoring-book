public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    abstract class Price {
        abstract int getPriceCode();
        abstract double getCharge(int daysRented);

        public int getFrequentRenterPoints(int daysRented) {
            return 1;
        }
    }
    class ChildrenPrice extends Price {
        @Override
        double getCharge(int daysRented) {
            double result = 1.5; if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
            return result;
        }

        @Override
        int getPriceCode() {
            return Movie.CHILDREN;
        }
    }
    class NewReleasePrice extends Price {
        @Override
        public int getFrequentRenterPoints(int daysRented) {
            return (daysRented > 1) ? 2: 1;
        }

        @Override
        double getCharge(int daysRented) {
            return daysRented * 3;
        }

        @Override
        int getPriceCode() {
            return Movie.NEW_RELEASE;
        }
    }
    class RegularPrice extends Price {
        @Override
        double getCharge(int daysRented) {
            double result = 2;
            if (daysRented > 2)
                result += (daysRented - 2) * 1.5;
            return result;
        }

        @Override
        int getPriceCode() {
            return Movie.REGULAR;
        }
    }


    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDREN:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code!");

        }

    }

    public String getTitle() {
        return _title;
    }

}
