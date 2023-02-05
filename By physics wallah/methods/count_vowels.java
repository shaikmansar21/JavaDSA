import java.util.*;
public class count_vowels {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        vowels obj = new vowels();
        int ans=  obj.count(s);
        System.out.println(ans);
    }
}
class vowels {
    public static int count(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
                count++;
            }
        }
        return count;
    }
}