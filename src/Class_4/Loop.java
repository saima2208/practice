package Class_4;

public class Loop {
    public static void main(String[] args) {
        forLoop();
        whileLoop();
        //Do while loop
        int result = 0 ;

        int i = 0;
        do{
            result += i;
            System.out.println(i);
            i++;
        }while (i <= 100);

        System.out.println( "the sum is : " + result);
    }

    private static void whileLoop() {
        //while loop
        int result = 0;
        int i = 1;
        while (i <= 100){
            //System.out.println(i);
            result += i;
            i++;
        }
        System.out.println(result);
    }

    private static void forLoop() {
        // for loop
        for(int i = 1 ; i < 12; i++){

            if(i == 5) {
                continue;
                //break;
            }
            System.out.println("Saima" + i);
        }
    }
}
