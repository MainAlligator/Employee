package com.company;

import static java.lang.System.*;

public class Main {


    public static void main(String[] args) {
        Employee[] employees = new Employee[50];

        employees[0] = new Employee("Ali", "Barak", "sys admin", 000567);
        employees[1] = new Employee("Shuli", "Zay", "sys admin", 000543);
        employees[2] = new Employee("Steve", "Gurvin", "Junior Java Developer", 004567);
        employees[3] = new Employee("Bob", "Drabko", "Midle Java Developer", 004534);
        employees[4] = new Employee("Alla", "Petrova", "Accounter", 004111);
        employees[5] = new Employee("Sofia", "Grabovskaya", "Accounter", 004134);
        employees[6] = new Employee("Bagi", "Jo", "Accounter", 004144);
        employees[7] = new Employee("Ivan", "Poroshok", "Manager Production", 003426);


        Department programmersDepartment = new Department("Developers");
        Department accounterDepartment = new Department("Accounter");
        Department productionDepartment = new Department("Production");


        programmersDepartment.addEmployee(employees[0]);
        programmersDepartment.addEmployee(employees[1]);
        programmersDepartment.addEmployee(employees[2]);
        programmersDepartment.addEmployee(employees[3]);
        accounterDepartment.addEmployee(employees[4]);
        accounterDepartment.addEmployee(employees[5]);
        accounterDepartment.addEmployee(employees[6]);
        productionDepartment.addEmployee(employees[7]);


        for (Employee employee : employees) {
            if (employee != null) {

                out.println(employee.getSurname() + " " + employee.getName() + "Относится к отделу" + " " + employee.getDepartment().getDepartment());

                // programmersDepartment.removeEmployee(employees[2]);

            }
        }
    }
}


