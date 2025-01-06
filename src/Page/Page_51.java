package Page;

public class Page_51 {
    public static void main(String[] args) {
        //**** a ***
        int r = 11 , a = 22 , b = 33 , c = 44 ,d = 55;
        int math = 4/ 3 * (r + 34) - 9 * (a + b * c) + (3 + d * ( 2 + a)) / a + b * d ;
        System.out.println(math);
        // *** b ***
        int t = 66;
        System.out.println(5.5 * Math.pow((r + 2.5) , 2.5 + t ));
        page_56();
    }

    private static void page_56() {
        int a = 6 ;//b = a++ ;
        //int b = a++;
        System.out.println(a++);
        int  b1 = ++a;
        //System.out.println(b);
        System.out.println(b1);
    }
}
