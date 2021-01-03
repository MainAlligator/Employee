package com.company;

public class Department {


    private final String department;

    Employee [] employees = new Employee[50];


    public Department (String department){
        this.department = department;

    }


    public void addEmployee( Employee newEmployee) {
        employees [0] = newEmployee;
        newEmployee.setDepartment(this);
    }
  //  public void removeEmployee (Employee newEmployee){
       // for (Employee employee : employees) {
          //  if (employee == null) {
         //       System.out.println(employee + "FAIR");
           // }
     //   }



  //  }

    public String getDepartment() {
        return department;
    }
}
