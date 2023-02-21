import java.util.*;

class repeat{
    static int rep(int arr[]){

        for (int i =0; i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                   return arr[i];
                }
            }
        }
        return -1;
    }
}



public class RepeatValue {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of an Array: ");
        int a = in.nextInt();

        int arr[]= new int[a];
        for (int i = 0; i <arr.length; i++ ){
            arr[i]= in.nextInt();
        }
        int ans = repeat.rep(arr);
        System.out.print("The first Repeated num is: "+ans);

    }
}
