import java.util.*;

public class Calculation_of_Percentage {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int m3 = in.nextInt();
        int total_marks = m1+m2+m3;
        float percentage = total_marks/3;

        System.out.println("Total Marks: "+total_marks);
        System.out.println("Percentage: "+percentage+"%");

    }
}
