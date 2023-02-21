import java.util.Scanner;
class query{
    static int[] frequencyArray(int arr[]){
        int freq[]= new int[100005];
        for(int i = 0; i< arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
}

public class frequencyArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of an Array: ");
        int a = in.nextInt();

        int arr[]= new int[a];
        for(int i = 0 ; i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.print("Enter number of queries: ");
        int f = in.nextInt();

        int freq[]= query.frequencyArray(arr);

        while (f>0){
            System.out.print("Enter the number to be searched: ");
            int x = in.nextInt();
            if(freq[x]>0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            f--;
        }
    }
}
