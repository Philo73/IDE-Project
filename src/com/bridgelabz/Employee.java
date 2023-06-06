package com.bridgelabz;

public class Employee {
    public Integer empId;
    public String empName;

    public Employee(Integer empId1, String empName) {
        this.empId = empId1;
        this.empName = empName;
    }

    public int getEmpId() {
        //String name = "Philips";
        return empId;

    }

    public String getEmpName() {
        return empName;
    }
}