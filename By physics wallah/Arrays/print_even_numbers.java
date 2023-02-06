class even{
    static void evenPlaces(int arr[]){

        for (int anx:arr) {
            if(anx%2==0){
                System.out.println(anx);
            }
        }
    }
}

public class print_even_numbers {
    public static void main(String[] args) {
        int []arr = {1,2,3,5,6,8,45,56,22};
        even.evenPlaces(arr);


    }
}
