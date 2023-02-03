import java.util.*;

public class GradesAndMarks {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int a = in.nextInt();

     if(a<30){
         System.out.println("Your grade is 'F'");

     }
     else if (a<=40){
         System.out.println("Your grade is 'E'");
     }
     else if (a<=50){
         System.out.println("Your grade is 'D'");
     }
     else if (a<=60){
         System.out.println("Your grade is 'C'");
     }
     else if (a<=70){
         System.out.println("Your grade is 'B'");
     }
     else if (a<=80){
         System.out.println("Your grade is 'B+'");
     }
     else if (a<=90){
         System.out.println("Your grade is 'A'");
     }
     else if (a<=100){
         System.out.println("Your grade is 'A+'");
     }
     else
         System.out.println("invalid Marks");
    }
}
