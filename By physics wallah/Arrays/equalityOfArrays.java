import java.util.*;
class compare {
    void compare() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of Array");
        int a = in.nextInt();

        int arr1[] =new int[a];
        int arr2[] =new int[a];

        for(int i = 0; i< arr1.length;i++) {
            arr1[i] = in.nextInt();
        }
        boolean ans = true;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
            if (arr2[i] != arr1[i]) {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}

public class equalityOfArrays {
    public static void main(String[] args) {
        compare hg = new compare();
         hg.compare();



    }
}

