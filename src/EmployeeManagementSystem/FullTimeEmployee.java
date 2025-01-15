package EmployeeManagementSystem;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int ID, double salary) {
        super(name, ID, salary);
    }

    @Override
    public void CalculatingTaxes() throws InvalidSalaryException {

        double tax = getSalary() * 0.05;

        if (getSalary() < 0){
            throw new InvalidSalaryException("Invalid salary");
        }
    }

    @Override
    public String toString() {
        return
                getName() +" "+  getID() +  " " + getSalary();
    }


    }

