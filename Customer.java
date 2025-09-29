import java.util.Scanner;

public class Customer{
    private int balance;

    Scanner in= new Scanner(System.in);
    public void showBalance(){
        System.out.println("your current balance is: Rs."+ balance);
    }

    Cashier uncle= new Cashier();
    public void payBill(){
        System.out.println("Enter the amount of cash given");
        int cash=in.nextInt();
        uncle.calculateChange(cash);
        balance=balance-cash;
    }

    public int addBalance(){
        System.out.println("Enter the amount to be added");
        int amount=in.nextInt();
        balance=balance+amount;
        System.out.println("balance added!");
        return balance;
    }
}