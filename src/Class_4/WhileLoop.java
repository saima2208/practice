package Class_4;

public class WhileLoop {
    public static void main(String[] args) {
        // While Loop
        int result = 0;
        int i = 1;

        while (i <= 100) {
            System.out.println(i);
            result += i;

            i++;
        }

        System.out.println("Sum is " + result);
    }
}
