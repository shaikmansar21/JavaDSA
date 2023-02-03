import java.util.*;

public class Main {
    public static void main(String[] args) {
        pattern(4);

    }

    static void pattern(int a) {


        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == a || j == 1 || j == 2 * i - 1)
                    System.out.print(i+" ");
                else {
                    System.out.print("  ");
                }
            }
                System.out.println();


        }

    }}