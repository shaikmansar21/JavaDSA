import java.util.Scanner;
public class Add_pos_nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int sum= 0;
        while (in.hasNextInt()){
            int a = in.nextInt();

            if(a>0 ){
           sum+=a;
        }
        else {
            sum= -1;
            break;
            }
        }

        System.out.println(sum);

    }
}
