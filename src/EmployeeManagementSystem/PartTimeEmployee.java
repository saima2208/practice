package EmployeeManagementSystem;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, int ID, double salary) {
        super(name, ID, salary);
    }

    @Override
    public void CalculatingTaxes() {
        System.out.println("Do not pay tax");
    }

    @Override

        public String toString() {
            return
                    getName() + " " + getID() + " " + getSalary();
        }



}
