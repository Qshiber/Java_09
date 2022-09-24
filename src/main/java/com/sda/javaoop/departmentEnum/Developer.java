package com.sda.javaoop.departmentEnum;

public class Developer extends Employee {

    public Developer(int id, String name, String surname, String pesel, Address address, Department department) {
        super(id, name, surname, pesel, address, department, EmployeeRole.JAVA_DEVELOPER);
    }


}
