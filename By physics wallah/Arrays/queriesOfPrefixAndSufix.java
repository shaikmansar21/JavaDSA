import java.util.*;
public class queriesOfPrefixAndSufix {
    static void print(int arr[]){
        for(int i = 1;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int sumOfPrefix(int arr[]){
        int total = 0;
        for (int i = 0; i< arr.length; i++){
            total+=arr[i];
        }
        return total;
    }
    static boolean isSufixIsEqualToPrefix(int arr[]){
        int total=  sumOfPrefix(arr);
        int pref=0;
        for(int i = 0; i<arr.length; i++){
            pref+=arr[i];
         int sufix = total-pref;
         if (pref==sufix){
             return true;
         }
        }
        return false;}
    static void makeprefixSum(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int a = in.nextInt();

        int arr[] = new int[a+1];
        for (int i =1; i <arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        boolean ans =queriesOfPrefixAndSufix.isSufixIsEqualToPrefix(arr);
//        System.out.println(ans);
        queriesOfPrefixAndSufix.makeprefixSum(arr);
//                queriesOfPrefixAndSufix.print(arr);

        System.out.print("enter num of queries");
        int q = in.nextInt();

        while(q-->0){
            System.out.print(" enter the range: ");

            int r = in.nextInt();
            int l = in.nextInt();
            int out =  arr[l]-arr[r-1];
            System.out.println(out);
        }
    }
}

