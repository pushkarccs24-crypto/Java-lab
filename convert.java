import java.util.Scanner;

interface CurrencyConverter{
    abstract void billAmount();
    static double dollarToInr(double amount){
        return amount*83;
    }
}

class convertINR implements CurrencyConverter{
   public void billAmount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount in usd");
        double usd=sc.nextDouble();
        double inr=CurrencyConverter.dollarToInr(usd);
        System.out.println("The given usd is in:"+inr);
        sc.close();
   }
}

public class convert {
    public static void main(String[] args) {

       convertINR c=new convertINR();
       c.billAmount();
    }
}
