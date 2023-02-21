import java.util.*;

class rotate {

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int[] rotate(int arr[], int k) {
        int n = arr.length;
        int ans[] = new int[n];
        k = k % n;
        int start = 0;
        for (int i = n - k; i < arr.length; i++) {
            ans[start++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[start] = arr[i];
            start++;
        }
        return ans;
    }


    static  void swap(int arr[],int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    static void arrayprint(int arr[], int i , int j){
        while(i<j) {
            arrays.swap(arr, i, j);
            i++;
            j--;
        }
    }
    static void rotateInPlace(int arr[],int k){
        int n = arr.length;
       rotate.arrayprint(arr,0,n-k-1);
       rotate.arrayprint(arr,n-k,n-1);
       rotate.arrayprint(arr,0,n-1);
    }
}




public class rotateByswap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int a = in.nextInt();

        int arr[]= new int[a];
        for (int i = 0 ;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.print("Enter how many times you want to rotate: ");
        int k = in.nextInt();

//    int ans[]=   rotate.rotate(arr,k);
//       rotate.print(ans);
        rotate.rotateInPlace(arr,k);
        rotate.print(arr);
    }

}
