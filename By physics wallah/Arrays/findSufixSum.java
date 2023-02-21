import java.util.*;
class problem{

    static void print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void sufixSum(int arr[]){
        for(int i = arr.length-2; i>=0;i--){
            arr[i]= arr[i+1]+arr[i];
        }
    }
    static void makeprefixSum(int arr[]){
        int n = arr.length;
           for(int i=1;i<n;i++){
                    arr[i]=arr[i-1]+arr[i];
           }
    }
}
public class findSufixSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int a = in.nextInt();

        int arr[]= new int[a];
        for (int i = 0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
//         problem.makeprefixSum(arr);
      problem.sufixSum(arr);
        problem.print(arr);
    }
}
