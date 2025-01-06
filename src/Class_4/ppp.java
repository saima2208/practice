package Class_4;

public class ppp {



    public static void main(String[] args) {
        int rows = 5, star = 0;

        for (int i = 1; i <= rows; ++i, star = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (star != 2 * i - 1) {
                System.out.print("* ");
                ++star;
            }

            System.out.println();
        }
    }
}