package EmployeeManagementSystem;

public class ContractEmployee extends Employee{

    public ContractEmployee(String name, int ID, double salary) {
        super(name, ID, salary);
    }

    @Override
    public void CalculatingTaxes() throws InvalidSalaryException{

        if (getSalary() <0){
            throw new InvalidSalaryException("Invalid Salary");
        }
        double tax = getSalary() * 0.025;

    }

    @Override
    public String toString() {
        return
        getName() + " " + getID() + " " + getSalary();
    }


}
