package ClassWork;

public class Initializer {
   static int initialValue;
   static String name;
   static{
       initialValue = 1000;
       name = "saima";
       System.out.println(initialValue);
   }
    public static void main(String[] args) {
        System.out.println(Initializer.initialValue);
        System.out.println(name);
        Initializer initializer = new Initializer();



        System.out.println(initializer);



    }


}
