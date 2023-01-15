import java.util.*;

public class inputStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String first_name = in.next();
        String last_name = in.next();
        int roll = in.nextInt();
        String interest = in.next();

        System.out.println("Name:"+ first_name+" "+last_name);
        System.out.println("Roll Number:"+roll);
        System.out.println("Field of interest:"+interest);
    }
}