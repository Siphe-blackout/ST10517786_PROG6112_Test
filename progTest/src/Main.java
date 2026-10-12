import java.util.Scanner;

void main() {
    Scanner s = new Scanner(System.in);

    System.out.println("Select Beverage Type");
    System.out.println("1) COFFEE");
    System.out.println("2) TEA");
    System.out.println("3) BOBA");
    int choice = s.nextInt();

    String BeverageType = switch (choice) {
        case 1 -> "COFFEE";
        case 2 -> "TEA";
        case 3 -> "BOBA";
        default -> "UNKNOWN";
    };

    System.out.println("Enter City");
    String City = s.next();

    System.out.println("Enter Total Amount of Sales: ");
    int TotalSales = s.nextInt();

    BeverageSales beverageSales = new BeverageSales(BeverageType, City, TotalSales);
    beverageSales.Print();
}