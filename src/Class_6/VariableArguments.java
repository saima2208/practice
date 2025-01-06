package Class_6;

public class VariableArguments {
    public static void main(String[] args) {
        int num = biggestNumber(656, 785445, 865443);

        System.out.println(num);
    }
    public static int biggestNumber(int n1, int n2, int n3){
        return Math.max(Math.max( n1 ,  n2) ,n3);


    }
    public static int biggestNumber(int ...numbers){
        if (numbers.length == 0){
            return 0;
        }
        int max = numbers[0];
        for (int num : numbers){
            if (num > max){
                max = num;
            }
        }
        return max;
    }
}
