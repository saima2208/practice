package W3Reasources;

public class FindMin {
    public static void main(String[] args) {
        try {
            int[] num = {2,3,5,77,99,66,111,8,2};
            int min = num[0];
            int max = num[0];

            for (int i : num){
                if (min > i){
                    //min = num[i];
                    min = i;
                }
                if (max < i){
                    max = num[i];
                    //max = i;
                }

            }
            System.out.println(min);
            System.out.println(max);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    //}
//}




//public class FindMin {
   // public static void main(String[] args) {
        try {
            int[] num = {2, 3, 5, 77, 99, 66, 111, 8, 2};
            int min = num[0];
            int max = num[0];

            // Loop to find both min and max
            for (int i : num) {
                if (min > i) {
                    min = i; // Update min with the element value
                }
                if (max < i) {
                    max = i; // Update max with the element value
                }
            }

            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

