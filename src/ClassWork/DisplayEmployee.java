package ClassWork;

public class DisplayEmployee {
    public static void main(String[] args) {
        Employee1 rahul = new Employee1();
        rahul.setName("Rahul");
        rahul.setSalary(20000);
        rahul.setAddress("Tilak Nagar,New Delhi");
        rahul.setYear();

        Employee1 roman = new Employee1();
        roman.setName("Raman");
        roman.setYear();
        roman.setAddress("Haro Nagar,New Delhi");
        roman.setSalary(25000);

        Employee1 rohit = new Employee1();
        rohit.setName("Rohit");
        rohit.setYear();
        rohit.setSalary(24000);
        rohit.setAddress("Subash Nagar,New Delhi");

        System.out.println(" Name\t "+" Year of joining\t\t\t "+" Address");
        //System.out.println(rahul.getName() +"\t " + rahul.getYear()+ "\t\t\t "+ rahul.getAddress());
        //System.out.println(roman.getName() + "\t " + roman.getYear()+"\t\t " +roman.getAddress() );
       // System.out.println(rohit.getName()+"\t "+ roman.getYear() +"\t\t " + rohit.getAddress());
        //System.out.println(Employee1.toString());

    }
}
