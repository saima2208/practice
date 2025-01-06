package InstanceOf;

public class TestFruit {
    public static void main(String[] args) {
       //Fruit fruit = new Fruit();
        Orange orange = new Orange();
        Apple apple = new Apple();
        Fruit fruit = new GoldenDelicious();
        McIntosh mcIntosh = new McIntosh();
        GoldenDelicious goldenDelicious = new GoldenDelicious();
       // Orange orange1 = new Apple();
       //McIntosh m = new Apple();


        Apple p = new McIntosh();


        System.out.println("a) fruit instanceof Fruit is " +  (fruit instanceof Fruit));
        System.out.println("b) fruit instanceof Orange is " + (fruit instanceof Orange));
        System.out.println("c)fruit instanceof Apple is " + (fruit instanceof Apple));
        System.out.println("d)fruit instanceof Apple is " + (fruit instanceof GoldenDelicious));
        System.out.println("e)fruit instanceof McIntosh is " + (fruit instanceof McIntosh));
        System.out.println("f)orange instanceof Orange is " +(orange instanceof Orange));
       System.out.println("g)orange instanceof Fruit "+ (orange instanceof Fruit));
      // System.out.println("h)orange instanceof Apple " + (orange instanceof Apple));
        System.out.println("m) Apple p = new McIntosh(); is legal");
        System.out.println();
    }
}
