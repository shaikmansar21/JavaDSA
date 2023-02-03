import java.util.*;

public class Profit_or_loss {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter Cost price: ");
        int a = in.nextInt();
        System.out.print("Enter Selling price: ");
        int b = in.nextInt();

      int profit = b-a;
      int loss = a-b;

      if (a>b)
          System.out.println("loss amount is: "+loss);
      else{
          System.out.println("Profit amount is: "+profit);
      }
}}
