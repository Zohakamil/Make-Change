import java.util.Scanner;

public class Cashier{
    private int Bill; int total=0;
    private final int[] denominations={5000,1000,500,100,50,20,10,5,2,1};

    public void showBill(){
        this.Bill=total;
        System.out.println("Your bill Amount is Rs."+ Bill );
    }

    public void calculateChange(int cash){
        System.out.println(Bill);
        int change = (cash-Bill);
         if (change < 0) {
            System.out.println("❌ Customer needs to give more money!");
        }else if(change == 0) {
            System.out.println("✅ Exact amount given. No change needed.");
        }else{
            System.out.println("Amount to be Returned: Rs."+ change );
        }

        for(int i=0; i<denominations.length; i++){
            int count=change/denominations[i];

            if(count>0){
                System.out.println(denominations[i]+" x "+count);
                change=change% denominations[i];
            }
        }System.out.println("Change Returned");
    }

    public int calculateBill(){

        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of items purchased!");
        int totalNumberOfItems=in.nextInt();

        
        int i=1;
        while(i<=totalNumberOfItems){
            System.out.println("Enter the price of product");
            int price=in.nextInt();
            System.out.println("\nEnter the Quantity of the product");
            int quantity=in.nextInt();
            int totalPrice=price*quantity;
            
            total=total+totalPrice;
            i++;
        }
        return total;
    }
}