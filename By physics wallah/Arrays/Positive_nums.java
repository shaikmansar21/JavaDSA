
class arrays{
   public static void positive_nums(int []arr){
        for(int i= 0; i<arr.length;i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }
}

public class Positive_nums {
    public static void main(String[] args) {
        int []arr = {1,2,3,-4,5,-9,6,9,-9,-6};
        arrays.positive_nums(arr);
    }
}
