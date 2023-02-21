import java.util.*;
class seco {
    static int num(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secMax(int arr[]) {
        int max = num(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = num(arr);
        return secondmax;
    }
}


    public class SecondLargest {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter length of Array: ");

            int a = in.nextInt();
            int arr[] = new int[a];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }

            int ans = seco.secMax(arr);
            System.out.println(ans);

        }
    }
