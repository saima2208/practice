package Class_12;

public class StringClass {
    public static void main(String[] args) {
        String s = new String("This is a string");
        String s2= " This is a string";
        String s3 = new String("This is a string");
        String s4 = "this is a string";
        s2 = "change value";
        System.out.println("s2 == s3 is 🧨🧨" + (s2.equals(s3)));   //.equals check only value.
        System.out.println("s2 == s3 is " + (s2.equals(s4)));
        System.out.println("s == s3 is " + (s == s3));         // == check reference /memory.
        System.out.println("s == s3 is " + (s.equals(s3)));
    }
}
