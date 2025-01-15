package EmployeeManagementSystem;

abstract class Employee implements TaxCalculator {
    private String name;
    private int ID;
    private double Salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }


}
