public class Swap_two_numbers {
    public static void main(String[] args) {
        int a = 11;
        int b = 20;
        int e = a;
        int f = b;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("Before swap the numbers are a = "+e+" and b = "+f);

        System.out.println("After  swap the numbers are a = "+a+" and b = "+b);
    }
}
