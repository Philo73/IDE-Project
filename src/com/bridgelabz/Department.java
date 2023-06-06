package com.bridgelabz;

public class Department {
    private Integer depId;
    private String depName;
    Employee[] employees;

    public Department(Integer depId, String depName, Employee[] employees) {
        this.depId = depId;
        this.depName = depName;
        this.employees = employees;
    }
    public void show() {
        System.out.println("****Department details****");
        System.out.println("Department ID::" +depId);
        System.out.println("Department name::" +depName);

        System.out.println("***************");
        System.out.println("****Employees details****");

        for (Employee emp : employees) {

            System.out.println("Emp Id::" +emp.getEmpId());
            System.out.println("Emp name::"+ emp.getEmpName());
        }
    }
}
