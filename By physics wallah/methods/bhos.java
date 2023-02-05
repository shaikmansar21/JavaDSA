
    import java.util.Scanner;
    public class bhos {
        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the string:" );
            String s = scn.nextLine();
            System.out.print(count(s));
        }
        public static int count(String s){
            int count = 0;
            for(int i = 0; i < s.length(); i++){
//                char s.charAt(i) = s.charAt(i);
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                    count++;
                }
            }
            return count;
        }
    }


