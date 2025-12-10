public class SupermarketApp {
    public static void main(String[] args) {
        // Declare and initialize an array of product prices
        int[] prices = {120, 80, 150, 60, 200, 90};

        // Print the elements of the array
        System.out.println("Using for loop:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        // Calculate the total price of all products
        int total= 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        System.out.println("Total Amount: " + total);
    }
}