
  import java.util.Scanner;
    public class print_middle_num {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the string:");
            String s = scn.nextLine();
            alpha obj = new alpha();
            String ans = obj.middle(s);
            System.out.println(ans);

        }

    }
    class alpha {
        public static String middle(String s) {
            if (s.length() % 2 == 0) {
                return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
            } else {
                return s.substring(s.length() / 2, s.length() / 2 + 1);
            }
        }
    }

