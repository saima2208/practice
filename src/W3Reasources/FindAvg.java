package W3Reasources;

public class FindAvg {
    public static void main(String[] args) {
        int[] num= {2,4,5,6,7,22,77,88,11,99,22};
        int  sum = 0;
        int  len = num.length;

        //long multiplication = 1;
        for (int i = 0;i < num.length;i++){
            sum += num[i];

        }
        int  avg = sum / len;
        System.out.println("The sum is " + sum);
        System.out.println(sum/len);
        System.out.println(avg);
        System.out.println(len);
    }
}
