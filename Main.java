import java.util.Scanner;

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }
}

class SavingsAccount extends BankAccount {
    void addInterest() {
        balance = balance * 1.05;
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        if (sc.hasNextDouble()) {
            double amount = sc.nextDouble();
            acc.deposit(amount);
            acc.addInterest();
            System.out.println("Final balance after interest: " + acc.balance);
        } else {
            System.out.println("Invalid input.");
        }
        sc.close();
    }
}