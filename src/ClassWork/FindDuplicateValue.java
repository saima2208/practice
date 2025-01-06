package ClassWork;

import java.util.HashSet;

public class FindDuplicateValue {
    public static void main(String[] args) {
        int [] values = {11,50,30,22,11,4,2,6,3,2};
        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for (int num :values){
            if (!unique.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println("Duplicates :" + duplicate );

    }
}

