//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String[] City = {"Cape Town", "Port Elizabeth", "Pretoria"};
    int[][] Sales = {{500, 450, 480}, {300, 250, 175}, {125, 100, 120}};
    String[] BeverageType = {"COFFEE", "BOBA", "TEA"};


    System.out.println("Monthly Weight Loss For Gyms");
    System.out.println("*****************************************************************************************************************");
    System.out.println("BeverageTypes      Coffee             Boba               Tea");

    System.out.printf("%-19s", " ");


    System.out.println();
    for (int weight = 0; weight < Sales.length; weight++) {
        System.out.printf("%-19s", City[weight]);
        for (int mass = 0; mass < Sales[weight].length; mass++) {
            System.out.printf("%-19d", Sales[weight][mass]);

        }
        System.out.println();
    }

    System.out.println("*****************************************************************************************************************");
    System.out.println("Product Sales Totals for Each City");
    System.out.println("*****************************************************************************************************************");

    for (int weight = 0; weight < Sales.length; weight++) {
        System.out.printf("%-19s", City[weight]);
        for (int mass = 0; mass < Sales[weight].length; mass++) {
            System.out.printf("%-19d", Sales[weight][mass]);

        }

    }
}

