import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class raisingPower {
    private static void main(String[]args
    ){
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();

        int b = in.nextInt();

        int power=1;

        for(int i= 1; i<=b; i++)
            power = power*a;
        System.out.println(a+" Raise to power "+b+": "+power);

    }


}
