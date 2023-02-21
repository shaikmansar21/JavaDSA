import java.util.*;
public class positiveToNegative {
    static void print(int arr[]){
        for(int i = 1;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int[] pnNums(int nums[]) {
        int e= 0; // Even indices
        int o = 1 ; // odd indices
        int n = nums.length;
        int [] ans = new int [n];

        for(int elem :nums){
            if(elem >=0){
                ans[e]=elem;
                e+=2;
            }else{
                ans[o]=elem;
                o+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of Array: ");
        int a = in.nextInt();

        int arr[] = new int[a];
        for (int i = 0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
       int ans[]= pnNums(arr);

        print(ans);

    }
}
