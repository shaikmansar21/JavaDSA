import java.util.*;

class findPair{
    static boolean findx(int arr[], int x){
        for (int i= 0 ;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]-arr[j]==-x||arr[i]-arr[j]==x){
                    return true;
                }
            }
        }
        return false;
    }
}
public class findPairOfXdiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of an array: ");
        int a = in.nextInt();

        int arr[]= new int[a];
        for (int i = 0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.print("Enter X value");
        int x = in.nextInt();

        boolean ans = findPair.findx(arr,x);
        System.out.println(ans);

    }
}
