public class WarehouseStockTracking {
    public static void main(String[] args) {

        int[][][] stock = {
            { {50, 30, 20}, {40, 25, 15} },  // Warehouse 1
            { {60, 35, 25}, {55, 28, 18} }   // Warehouse 2
        };

        System.out.println("All Stock Values:");
        for (int warehouse = 0; warehouse < stock.length; warehouse++) {
            System.out.println("Warehouse " + (warehouse + 1) + ":");
            for (int section = 0; section < stock[warehouse].length; section++) {
                for (int product = 0; product < stock[warehouse][section].length; product++) {
                    System.out.print(stock[warehouse][section][product] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        int totalWarehouse2 = 0;
        for (int section = 0; section < stock[1].length; section++) {
            for (int product = 0; product < stock[1][section].length; product++) {
                totalWarehouse2 += stock[1][section][product];
            }
        }

        System.out.println("Total stock in Warehouse 2: " + totalWarehouse2);
    }
}