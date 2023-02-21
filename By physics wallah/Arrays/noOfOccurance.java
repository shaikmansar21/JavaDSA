import java.util.Scanner;
class target{
    static int targer(int arr[],int a){
        int count = 0;

        for (int i = 0; i< arr.length;i++){
            for (int j = i+1 ; j<arr.length; j++){
                if (arr[i]==arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
public class noOfOccurance {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Enter length of an Array: ");
        int a = in.nextInt();

        int arr[] = new int[a];
        for (int i =0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.print("Enter Target Number: ");
        int x = in.nextInt();
        int ans = target.targer(arr,x);
        System.out.println(ans);

    }
}
