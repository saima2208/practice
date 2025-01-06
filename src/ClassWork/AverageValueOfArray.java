package ClassWork;

import java.util.Arrays;

public class AverageValueOfArray {
    public static void main(String[] args) {
        int [] arr = {33,43,66,23,88,333,77,222};
       //System.out.println(Arrays.stream(arr).average());
       //
        //int [] arr1 = {5,20,30,40,5};
        //System.out.println(Arrays.stream(arr).average());
        //System.out.println(Arrays.stream(arr1).average().getAsDouble());
        double sum = 0;
        for (int i : arr){
            sum += i;
        }
        int length = arr.length;
        double avg = sum/ arr.length;
        System.out.println(avg);
    }
}
