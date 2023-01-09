import java.util.*;

public class amstrong_num {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();

        int rev ;
        int sum = 0;
        int digit = 0;
        int temp=0;



//
//        for (int j=1;j<=n;j++) {
//            int temp = j;
//            while( j>0){
//                 digit = j % 10;
//
//                sum += (digit * digit * digit);
//                j = j / 10;
//
//                if (sum == temp)
//                    System.out.println(j);


//            }
        for(int i =1; i<=n; i++)

                  while (i>0) {
                      temp = i;
                      digit = i % 10;

                      sum += digit * digit * digit;
                      i /= 10;

                      if (sum == temp)
                          System.out.println(i);
                  }



        }



        }



