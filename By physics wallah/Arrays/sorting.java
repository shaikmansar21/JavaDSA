import java.util.*;
class problems{
    static int[] sortingSquares(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int k = arr.length-1;
        int ans[] =new int[arr.length] ;

        while(start<=end){
            if(Math.abs(arr[start])>Math.abs(arr[end])){
                ans[k--]=arr[start]*arr[start];
                start++;
            }
            else{
                ans[k--]=arr[end]*arr[end];
                end--;
            }
        }
      return ans;
    }
    static void print(int arr[]){
        for (int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[], int i,int j){

        int temp =arr[i];
        arr[i]=arr[j];
      arr[j]  =temp;
    }
    static void evenOddSort(int arr[]){

        int i = 0;
        int j = arr.length-1;
            while(i<j){
                if(arr[i]%2==0&&arr[j]!=0){
                    swap(arr,i,j);
                    i++;
                    j--;
                }
                if(arr[i]%2!=0){
                    i++;
                }
                if(arr[j]%2==0){
                    j--;
                }
            }
    }
}
public class sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of an Array: ");
        int a = in.nextInt();

        int[] arr = new int[a];
        for(int i = 0; i<arr.length;i++){
            arr[i]= in.nextInt();
        }
//        problems.evenOddSort(arr);
      int ans[]=  problems.sortingSquares(arr);
        problems.print(ans);
    }
}
