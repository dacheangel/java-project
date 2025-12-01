import java.util.Scanner;
class Employee{
    String name;
    double salary;
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Lecturer extends Employee{
    String department;
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
public class Main{
    public static void main(String []args){
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter name:");
    String name=sc.nextLine();
    System.out.print("Enter salary:");
    double salary=sc.nextDouble();
    sc.nextLine();
    System.out.print("Enter department:");
    String department=sc.nextLine();
    Lecturer lec = new Lecturer();
    lec.name = name;
    lec.salary = salary;
    lec.department = department;
    System.out.println("\n---Lecturer Information---");
    lec.displayInfo();
    sc.close();
}
}