import java.util.*;

public class patterns {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();

        pattern7(50);
    }

//    Pattern to print an Arrow
    static void pattern1(int a){

        for(int i = 1; i<= 2*a; i++){
                int c = i>a?2*a-i-1:i-1;
            for ( int j= 1; j<=c ; j++ ) {

                    System.out.print(" ");
            }
            int d= i>a?a*2-i:i;
            for (int j = 1; j<=d;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
//Pattern to print Square;
static void pattern2(int a ){
        for (int i=1; i<=a; i++){

            for(int j =1; j<=a; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
}
//Pattern to print triangle in reverse
static void pattern3(int a ){
        for(int i = 1; i<= a; i++){

            for(int j= 1; j<=i-1;j++){
                System.out.print(" ");
            }

            for (int j = 0 ; j<=a-i ; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
}

// Pattern to print + icon;
    static void pattern4(int a){

        for(int i = 1 ; i <= a; i++){
            for (int j = 1; j<=a; j++){
                if (i==a/2+1 || j== a/2+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

// Pattern to print inverted triangle

static void pattern5(int a ){
        for (int i = 1; i<=a ;i++){

            for(int j = 1; j<= i-1; j++){
                System.out.print(" ");
            }

            for(int j = 2*a-1; j>=i*2-1;j--){
                System.out.print("*");
            }

            System.out.println();
            }


        for(int i = 1; i<a; i++){

            for (int j = 1; j<a-i;j++){
                System.out.print(" ");
            }

            for(int j= 1; j<=i*2+1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
}

// pattern to print diamond with A-Z

    static void pattern6(int a ){
        int start =65;
        int num =0;
for (int i = 1; i<= a ;i++){

    for ( int j = 1; j<=a-i;j++){
        System.out.print(" ");
    }

    for (int j = 1; j<=i*2-1;j++){
        System.out.print((char)(start+num++));
    }

    num =0;
    System.out.println();

}
        for (int i = 1; i<= a ; i++){

            for(int j = 1; j<= i;j++) {
                System.out.print(" ");
            }

                for (int j= 2*a-(2*i+1); j>=1;j--){
                    System.out.print((char)(start+num++));
                }

                num=0;
                System.out.println();
            }
        }

//        Pattern to print prime triangle

    static void pattern7(int a ){

        for (int i = 1; i<= a-1;i++){
            int count =0;
            for (int j = 2; j<=a/2;j++){
                if (i%j==0) {
                    count++;
                    break;
                }
                }
                if (count==0 || i!=1)
                    System.out.println(i);
                }


        }



    }




