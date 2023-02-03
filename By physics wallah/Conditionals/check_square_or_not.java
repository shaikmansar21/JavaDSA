import java.util.*;

public class check_square_or_not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length: ");
        int a = in.nextInt();
        System.out.print("Enter breadth: ");
        int b = in.nextInt();
        if (a==b){
            System.out.println("it is a square");
        }
        else{
            System.out.println("It is a Rectangle");

        }
        
        
    }
}