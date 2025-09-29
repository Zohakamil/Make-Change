

public class Main{
    public static void main(String[] args) {
      Cashier uncle=new Cashier();
      System.out.println("Cashier created");
      Customer zk=new Customer();
      System.out.println("customer created");

      uncle.calculateBill();
      uncle.showBill();
      zk.addBalance();
      zk.showBalance();
      zk.payBill();
      zk.showBalance();


    }
}