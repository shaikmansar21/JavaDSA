import java.util.*;

public class Cube_of_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = in.nextInt();

        int cube = num * num * num;
        System.out.println("Cube of the number is: "+ cube);
    }

}
