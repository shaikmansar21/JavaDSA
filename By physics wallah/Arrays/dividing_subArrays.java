import java.util.*;


public class dividing_subArrays {
    static int dividingSubArrays(int arr[], int m){
        Arrays.sort(arr);
        int max_diff= 0;
        int sum1 =0;
        int sum2 = 0;

        for(int i = 0; i<m; i++){
            sum1+=arr[i];
        }
        for (int i = m;i<arr.length;i++){
            sum2+=arr[i];
        }
        max_diff= Math.abs(sum1-sum2);

        return  max_diff;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int a = in.nextInt();

        int arr[]= new int[a];
        for(int i =0 ; i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.print("Enter the num of elements in sub array: ");
        int m = in.nextInt();

        int ans = dividingSubArrays(arr,m);
        System.out.println(ans);
    }

}
