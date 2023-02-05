import java.util.*;

class smallest{
    public static int small(int a, int b, int c){
        int smallest = a;
        if (b<smallest){
            smallest= b;
        }
        if(c<smallest){
            smallest = c;
        }
        return smallest;
    }
}

public class smallestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any three nums: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        smallest num = new smallest();
        int ans = num.small(a,b,c);
        System.out.println("smallest among these nums is: "+ans);



    }
}
