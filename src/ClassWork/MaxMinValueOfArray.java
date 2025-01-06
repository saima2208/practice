package ClassWork;

public class MaxMinValueOfArray {
    public static void main(String[] args) {
        int[] value = {11, 22, 33, 44, 66, 99, 21, 10, 77, 55};
        int n = value.length;
        System.out.println("Max number is  " + maxNumber(value, n));
        System.out.println("MinNumber is " + minNumber(value,n));
    }

    static int maxNumber(int[] value, int n) {
        int result = value[0];
        for (int i = 1; i < n; i++) {
            result = Math.max(result, value[i]);
          //  return result;
        }
        return result;

    }
    static  int  minNumber(int [] value, int n){
        int result = value[0];
        for (int i =1; i<n; i++){
            result = Math.min(result, value[i]);

        } return result;
    }
}
