
import java.util.*;
class min{
    static void minNum(int arr[]){
       int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min);
    }
}

public class minimumOfGivenNums {
    public static void main(String[] args) {
        int arr []= {5,-8,-10,5,2,9,3,5};
        min.minNum(arr);


    }
}
