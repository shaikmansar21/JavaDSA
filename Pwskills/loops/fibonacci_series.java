import java.util.*;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner in=  new Scanner(System.in);
        int num_1 = 0;
        int num_2 = 1;

             int next_num=0;


        int n = in.nextInt();
      System.out.println(num_1);
        System.out.println(num_2);
        for (int i = 1; i<=n-2;i++){


            next_num = num_1+num_2;
            System.out.println(next_num);
             num_1 = num_2;
             num_2 = next_num;




        }
    }
}
