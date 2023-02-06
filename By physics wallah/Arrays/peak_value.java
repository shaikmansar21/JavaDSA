class peak{
    static void peakValue(int arr[]){

        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
public class peak_value {
    public static void main(String[] args) {
        int arr[]= {1,2,3,7,6,5,9,};
        peak.peakValue(arr);

    }
}
