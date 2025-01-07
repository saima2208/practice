package W3Reasources;

public class FindMin {
    public static void main(String[] args) {
        int[] num = {2,3,5,77,99,66,111,8,2};
        int min = num[0];
        for (int i : num){
            if (min > i){
                min = num[i];
            }
        }
        System.out.println(min);
    }
}
