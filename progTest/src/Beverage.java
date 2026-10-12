public abstract class Beverage implements IBeverage {
    private final String beverageType;
    private final String city;
    private final int totalSales;

    protected Beverage(String beverageType, String city, int totalSales) {
        this.beverageType = beverageType;
        this.city = city;
        this.totalSales = totalSales;
    }

    // Copy constructor (what your existing BeverageSales uses)
    protected Beverage(Beverage model) {
        this(model.getBeverageType(), model.getCity(), model.getTotalSales());
    }

    @Override public String getBeverageType() { return beverageType; }
    @Override public String getCity() { return city; }
    @Override public int getTotalSales() { return totalSales; }
}