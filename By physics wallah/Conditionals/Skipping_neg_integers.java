import java.util.*;


public class Skipping_neg_integers {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int a = in.nextInt();

        if ( a<0 )
        {
            System.out.println("the num is negative so skipped");
        }
        else System.out.println(a);
    }
}
