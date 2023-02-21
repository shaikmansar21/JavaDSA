import java.util.*;
class arrayProblems{
    static int[] revArray(int[] arr,  int a){
        int ans[] = new int[a];
        int j =0;

        for (int i= a-1; i>=0;i--){
            ans[j++]= arr[i];
        }
        return ans;
    }
    static void print(int ans[]){
         for (int i= 0;i<ans.length;i++) {
             System.out.print(ans[i] + " ");
         }
    }
}


public class reversingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of an Array: ");
        int a = in.nextInt();

        int arr[] = new int[a];
        for (int i = 0; i<arr.length;i++){
            arr[i]= in.nextInt();
        }

        int[] ans = arrayProblems.revArray(arr, a);

       arrayProblems.print(ans);
    }
}
