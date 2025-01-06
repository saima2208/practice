package Class_7;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[] primeNumber = {2,3,5,7,11,13,61,67,17,19,23,29,31,37,41,43,47,53,59,71,73,79,83,89,97};
        System.out.println(Arrays.toString(primeNumber));
        Arrays.sort(primeNumber);
        int[] copyOfPrimeNumber = Arrays.copyOf(primeNumber, primeNumber.length);
        System.out.println(Arrays.toString(copyOfPrimeNumber));
        Integer[] test = new Integer[primeNumber.length];
        for (int i = 0; i < primeNumber.length; i++){
            test[i] = primeNumber[i];
        }
        //Arrays.sort(test, Collections.reverseOrder());
        System.out.println(Arrays.toString(test));
        int [] [] axis = new  int[3][2];
        axis [0][0] = 1;
        axis [0][1] = 2;
        axis [1][0] = 11;
        axis [1][1] = 12;
        axis [2][0] = 81;
        axis [2][1] = 51;
        //axis [2][2] = 2354;
        int [][] matrix = {
                {213213,455,87,5645},
                {66,88,22},
                {675,976,854,345,0,1,}
        };
        System.out.println(Arrays.deepToString(matrix));
    }
}
