package ClassWork;

public class FindCommonElements {
    public static void main(String[] args) {
        String[] arr1 = {"ALFI","BANGLADESH","NEPAL","PAKISTAN","ENGLAND"};
        String[] arr2 = {"ASHFI","FINLAND","ITALY","BANGLADESH","NEPAL"};
        String common = "";
        String common1 = common;
        for (String st : arr1){
           for(String st1 : arr2){
              if (arr1 == arr2){
                  String common2 = common1;
              }
           }
        }
        System.out.println(common1);

    }
}
