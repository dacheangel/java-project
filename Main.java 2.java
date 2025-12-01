class Vehicle {
    String brand;
    int year;
}
class Car extends Vehicle {
    int seats;
}
class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.year = 2024;
        myCar.seats = 10;

        System.out.println("Car Details:");
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Year: " + myCar.year);
        System.out.println("Seats: " + myCar.seats);
    }
}