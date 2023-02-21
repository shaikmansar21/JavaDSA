import java.util.*;
class uniq{
    static int unq(int arr[]){

        for (int i= 0; i<arr.length;i++){
            for(int j =i+1; j<arr.length;j++ ){
                if (arr[i]==arr[j]){
                    arr[i]= -1;
                    arr[j]= -1;
                }
            }
        }

        int ans = -1;
        for (int i = 0; i<arr.length;i++ ){
            if (arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;

    }
}

public class uniqueNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of Array: " );
        int a = in.nextInt();
        int arr[]= new int[a];
        for (int i = 0 ;i<arr.length;i++){
            arr[i]= in.nextInt();

        }
        int ans = uniq.unq(arr);
        System.out.println(ans);



    }
}
