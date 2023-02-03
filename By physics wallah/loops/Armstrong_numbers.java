
import java.util.*;

public class Armstrong_numbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int range = in.nextInt();

        int i = 1;
        for(i=1;i<=range;i++){
            int count = 0;
            int j = i;
            while (j!=0){
                count++;
                j/=10;
            }
            int sum = 0;
            int num = i;
            while(num!=0){
                int digit = num%10;
                sum+= Math.pow(digit,count);
                        num/=10;
                if (sum>num){
                    continue;
                }
            }
            if (sum==i){
                System.out.println(i);
            }


        }

    }
}