
class odd{
    static void odd_places(String []arr){
        for(int i=0; i<arr.length;i++){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}

public class print_odd_Places {
    public static void main(String[] args) {

        String arr [] = {"ab","bc","dc","sf","hg","gh"};

        odd.odd_places(arr);


    }
}
