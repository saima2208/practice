package Class_3;

public class StringFunction {
    public static void main(String[] args) {
        String name  = "I LOVE Bangladesh";
        String nameTwo = "\"\t\t\t\t\nwho are you \n\t\" ";
        String nameThree = "\"who are you\"";
        System.out.println(nameTwo.trim());
        System.out.println(nameThree);
        System.out.println(nameThree.substring(3));
        System.out.println(nameThree.substring(3,7));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.isEmpty() );
        System.out.println(name.concat(" add"));
        System.out.println(name.length() );
        System.out.println(name.charAt(2));
        //System.out.println(anotherName.isEmpty(""));
        System.out.println(name.endsWith("sh"));
        System.out.println(name.indexOf("A"));
        System.out.println(name.contains("V"));

        String nahid = "human";
        String hemel = "Human";
        System.out.println(nahid.equals(hemel));
        System.out.println(nahid.equalsIgnoreCase(hemel));
        String numString = "22";
        int convertedFromString = Integer.parseInt(numString);
        System.out.println(convertedFromString);
        int a = 123;
        String valueOf = String.valueOf(a);
        System.out.println(valueOf);



    }
}
