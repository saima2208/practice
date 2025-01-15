package EmployeeManagementSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        try {
            File file = new File("C:\\Users\\Java Student PC-7\\Desktop\\JAVA\\practice\\Employee.csv");
            Scanner reader = new Scanner(file);
            while (reader.hasNext()){
                String[] data = reader.nextLine().split(",");
                String name = data[0];
                int ID= Integer.parseInt(data[1]);
                double salary = Double.parseDouble(data[2]);
                String type = data[3];

                if (type.equalsIgnoreCase("FullTime")){
                    employees.add(new FullTimeEmployee(name,ID,salary));
                } else if (type.equalsIgnoreCase("PartTime")) {
                    employees.add(new PartTimeEmployee(name,ID,salary));
                } else if (type.equalsIgnoreCase("Contract")) {
                    employees.add(new ContractEmployee(name,ID,salary));

                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }

        try {
            PrintWriter write = new PrintWriter("C:\\Users\\Java Student PC-7\\Desktop\\JAVA\\Git\\practice\\src\\EmployeeManagementSystem\\Employee.csv");
            for (Employee employee: employees){
                employee.setSalary(400);
                write.println(employee);
            }

            write.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
        }

    }
}
