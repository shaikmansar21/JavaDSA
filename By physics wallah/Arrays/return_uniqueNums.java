import java.util.*;

public class return_uniqueNums {
    static boolean uniqueNums(int arr[], int c){
        Arrays.sort(arr);

        int i =0;
        int count = 0;
        while (i<arr.length){
            count++;
            while(i<arr.length-1&&arr[i+1]==arr[i]){
                i++;
            }
            i++;
        }
        if(count ==c){;
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num to check the count of unique nums in the array");
        int c = in.nextInt();

        System.out.print("Enter length of array: ");
        int a = in.nextInt();

        int arr[] = new int[a];
        for (int i =0; i <arr.length; i++) {
            arr[i] = in.nextInt();
        }
        boolean ans = uniqueNums(arr,c);
        System.out.println(ans);
    }
}
