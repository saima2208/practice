package ClassWork;

import java.util.Arrays;

public class Q_5 {
    public static boolean cons(int[] arr) {
        java.util.Arrays.sort(arr);
        int low = arr[0] , high = arr[arr.length-1] , sum = 0 , total = 0;
        for(int i = low; i <= high; i++){
                sum += i;
            }
        for (int j : arr) {
            total += j;
        }
            return (total == sum);
            }
        public static void main(String[] args) {

          // int[] arr1 = {56,54,52,50,51,55,53};
                int[] arr = {2,3,4,5,6,7,7,8,9};
                //Arrays.sort(arr1);

            System.out.println(Arrays.toString(arr)+" is "+ cons(arr));
                //System.out.println(Arrays.toString(arr1));

        }

        }

