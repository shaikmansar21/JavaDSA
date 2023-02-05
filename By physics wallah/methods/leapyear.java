import java.util.*;

class year{
    public static int leap_year(int yr){
        int ans ;
        if (yr%4 == 0 && yr%100!=0||(yr%100==0&&yr%400==0) )
            ans = 1;
        else {
            ans = 0;
        }
        return ans;
    }
}




public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int yr = in.nextInt();

        year leap = new year();
        int ans = leap.leap_year(yr);
        if (ans == 1 ){
            System.out.println("it is a leap year");
        }
        else {
            System.out.println("it is not a leap year");        }



    }
}
