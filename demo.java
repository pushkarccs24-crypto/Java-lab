import java.util.*;

interface Payment {
boolean process(double amount);
}

class CreditCard implements Payment{
      public boolean process(double amount){
         return amount<=50000;
      }

}

class UPI implements Payment{
   public boolean process(double amount){
        return amount<=100000;
   }
}


public class demo {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      CreditCard c=new CreditCard();
      UPI u = new UPI();
      System.out.println("Enter the payment option:\n1.Credit Card\n2.Upi\n3.Exit");
      int choice = sc.nextInt();
      switch (choice) {
         case 1:{
            System.out.println("Enter the payment amount");
            double amt=sc.nextDouble();
            if(amt<0){
               System.out.println("Invalid amount");
               break;
            }
            boolean b=c.process(amt);
            if(b==true) System.out.println("Payment successful");
            else System.out.println("Payment failed");
            break;
         }
         case 2:{
            System.out.println("Enter the payment amount");
            double amt=sc.nextDouble();
             if(amt<0){
               System.out.println("Invalid amount");
               break;
            }
            boolean b=u.process(amt);
            if(b==true) System.out.println("Payment successful");
            else System.out.println("Payment failed");
            break;
         }
         case 3:{
            System.out.println("Exiting-----");
            break;
         }
      
         default:
            System.out.println("Invalid choice.Please enter again");
      }
      sc.close();

   } 
}
