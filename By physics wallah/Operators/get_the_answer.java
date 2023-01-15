import java.util.*;

public class get_the_answer {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in) ;

        int a = in.nextInt();
        int ans = (a+8)/3%5*5;
        System.out.println(ans);

    }
}
