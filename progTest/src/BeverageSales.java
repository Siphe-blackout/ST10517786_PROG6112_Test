public class BeverageSales extends Beverage {

    public BeverageSales(String BeverageType, String City, int TotalSales) {
        super(BeverageType, City, TotalSales);
    }

    public BeverageSales(Beverage model) {
        super(model);
    }

    public void Print() {
        System.out.println("***********************************************");
        System.out.println("NUMBER 1 COFFEE HUT REPORT");
        System.out.println("***********************************************");
        System.out.println("BEVERAGE TYPE: " + getBeverageType());
        System.out.println("CITY: " + getCity());
        System.out.println("TOTAL SALES: " + getTotalSales());
        System.out.println("***********************************************");
    }
}