class CoffeeOrder{
    String size;
    double price;
    CoffeeOrder(String size,double price){
        this.size=size;
        this.price=price;
    }
}
public class CoffeeShop{
    public static void main(String[]args){
        CoffeeOrder order1=new CoffeeOrder("large",4.50);
        CoffeeOrder order2=new CoffeeOrder("small",2.25);
        System.out.println("Order1: Size      CoffeeOrder.java:13 - CoffeeShop.java:13"+order1.size+",Price-$"+order.price);
        System.out.println("Order2:Size      CoffeeOrder.java:14 - CoffeeShop.java:14"+order2.size+",Price-$"+order2.price);
    }
}