import java.util.*;

public class Area_of_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        double length = in.nextDouble();

        System.out.print("Enter breadth of Rectangle: ");
        double breadth = in.nextDouble();

        double area = (length * breadth)/2;
        System.out.println("Area of Rectangle: "+ area);

    }
}
