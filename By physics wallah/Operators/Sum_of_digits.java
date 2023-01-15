import java.util.*;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int a = in.nextInt();
        int sum = 0;

        while(a!=0){
            int digit = a%10;
            sum+=digit;
            a=a/10;
        }
        System.out.println(sum);
    }

}
