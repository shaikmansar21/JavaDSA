import java.util.*;

class triplets{
    static int target(int arr[], int tar){

        int ans = 0;
        for (int i = 0; i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == tar)
                        ans++;
                }
            }
        }

        return ans;
    }
}

public class tripletsOfSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int a = in.nextInt();

        int arr[]= new int[a];
        for (int i = 0; i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.print("Enter target number");
        int target = in.nextInt();
        int ans =triplets.target(arr,target);
        System.out.println(ans);
    }
}
