import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int add = num + 8;
        int div = add / 3;
        int mod = div % 5;
        int mul = mod * 5;

        System.out.println(mul);
    }
}
