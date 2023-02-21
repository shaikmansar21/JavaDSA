import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Scanner;



public class minimumPlatforms {
    static int findMinPlatforms(int arr[], int dep[]){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 0;
        int max =0;
       int i =0;
       int j = 0;
       while (i<arr.length){
           if (arr[i]<=dep[j]){
               count++;
               max = Math.max(count,max);
               i++;
           } else if (arr[i]>dep[j]) {
               count--;
               j++;
           }
       }
        return max;
    }
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        String s = in.nextLine();
        int a = in.nextInt();

        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int dep[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            dep[i] = in.nextInt();
        }
        int ans = minimumPlatforms.findMinPlatforms(arr,dep);
        System.out.println(ans);
    }
}
