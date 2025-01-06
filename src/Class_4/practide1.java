package Class_4;

public class practide1 {
    public static void main(String[] args) {
        int sum = 0;
        for( int i = 1 ; i<=1000 ;  i++){
            if (i% 3 ==0  && i % 5 ==0)
             //  System.out.println(i);
         sum = sum + i ;


        }
        System.out.println(sum );

        oddNumber();

    }
    // find odd number
    private static void oddNumber() {
        int sum = 0;
        for( int i = 1 ; i<=1000 ;  i+=2){


            sum = sum + i ;


        }
        System.out.println(sum );
        totalNumber();
    }

    private static void totalNumber() {
        int result = 0;
        for( int i = 1 ; i<=1000 ;  i++){


            result = result + i ;


        }
        System.out.println(result );
    }

}
