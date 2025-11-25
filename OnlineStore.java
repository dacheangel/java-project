class Product{
    private String name;
    private double price;
public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public void applyDiscount(double percentage){
        double discountAmount = price * (percentage / 100);
        price = price - discountAmount;  
    }
    public double getPrice(){
        return price;
    }
    public void displayDetails(){
        System.out.println("Product:" + name + ", Price: "  + String.format("%.2f", price));
    }
    }
    public class OnlineStore{
    public static void main(String[]args){
    Product product1=new Product("Laptop",1000.00);
    Product product2=new Product("Headphones",150.00);
    System.out.println("Orginal Prices:");
    product1.displayDetails();
    product2.displayDetails();
    product1.applyDiscount(15);
    product2.applyDiscount(10);
    System.out.println("\nPrices after discount:");
    product1.displayDetails();
    product2.displayDetails();
    System.out.println("\nUsing getPrice() method:");
    System.out.println("Laptop final price: $" + product1.getPrice());
    System.out.println("Headphones final price: $" + product2.getPrice());
    }
}