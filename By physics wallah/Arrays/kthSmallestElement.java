import java.util.*;

class smallest{
    static void KthElement(int arr[], int k){
        Arrays.sort(arr);
        System.out.println(arr[k-1]);

            }
        }






public class kthSmallestElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int a= in.nextInt();
        System.out.println("Enter "+ a +" numbers");
        int arr[] = new int[a];
        for(int i =0 ;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("enter kth smallest number" +
                "element: ");
        int k = in.nextInt();
        smallest.KthElement(arr,k);


    }
}
