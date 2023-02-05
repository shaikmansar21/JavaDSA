import java.util.*;
 class average {
    float Avg(int a, int b, int c) {
        float avg;
        avg = (float)(a + b + c) / 3;
        return avg;
    }
}
public class Avg_of_Three {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();

      average obj = new average();
      float ans =obj.Avg(a,b,c);
        System.out.println(ans);



    }

}
