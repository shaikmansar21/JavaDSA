import java.util.*;

public class Sum_of_prime_is_prime_or_not {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.println("please enter a valid prime number");
                break;
            } }


                while (a != 0) {
                    int digit = a % 10;
                    for (int j = 2; j <= digit / 2; j++)
                        if (digit % j != 0) {
                            a /= 10;
                        } else {
                            System.out.println("false");
                            break;
                        }
                }


            }
        }



