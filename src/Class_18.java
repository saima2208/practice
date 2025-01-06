public class Class_18 {
    public static void main(String[] args) {
        long n1 = 0;
        long n2 =1;


        int count = 50;
        System.out.print(n1 + "," + n2 + ",");
        for (int i = 2; i<count;i++ ){
            long n3 = n1 + n2;
           System.out.print(n3 + ",");
            n1= n2;
            n2=n3;
        }

    }
}
