package ClassWork;

import java.util.Date;

public class Employee1 {
    String name;
    Date year= new Date()  ;
    int salary;
    String address;

    public Employee1(String name, Date year, int salary,String address) {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.address = address;
    }

    public Employee1() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


    }

