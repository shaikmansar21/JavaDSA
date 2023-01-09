import java.util.*;

public class calculate_the_sum_till_the_user_wants {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int sum = 0;

        while (true){
            int a = in.nextInt();
            sum+=a;
            if (a>=0)
            System.out.println(sum);
            else{
                System.out.println(-1);
                break;
            }


        }


    }
}
