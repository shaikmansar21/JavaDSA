import java.util.*;
class arrays{
    static void print(int arr[]){
        for (int i= 0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static  void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    static void arrayprint(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i<j) {
            arrays.swap(arr, i, j);
            i++;
            j--;
        }
    }
}
public class reversingBySwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of an Array: ");
        int a = in.nextInt();

        int arr[]= new int[a];
        for (int i= 0; i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        arrays.arrayprint(arr);
        arrays.print(arr);
    }
}
