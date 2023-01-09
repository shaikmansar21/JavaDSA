import java.util.*;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        int sum =0;
        int ans =0;


        for(int i= 1; num>0;i++){
          ans= num%10;
          sum = sum +ans;
          num = num/10;

        }
        System.out.println(sum);
        ;
    }
}
