import java.util.*;

public interface calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter any operator ('+' '-' '*' '/')");
        char ch = in.next().charAt(0);

        int a = in.nextInt();
        int b = in.nextInt();



            switch(ch){
                case '+':
                    System.out.println(a+b);
                    break;

                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break;

                default:
                    System.out.println("invalid operatpr");

            }
        }

    }

