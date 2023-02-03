import java.util.*;

public class Fibonacci_series {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int first = 0;
        int second = 1;
        int series = 0;
        System.out.println(first + "\n" + second);
        for (int i = 1; i <= a - 2; i++) {
            series = first + second;
            first=second;
            second=series;

            System.out.println(series);


        }
    }}
