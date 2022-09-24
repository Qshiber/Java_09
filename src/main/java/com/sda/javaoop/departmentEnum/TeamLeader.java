package com.sda.javaoop.departmentEnum;

public class TeamLeader extends Employee {


    public TeamLeader(int id, String name, String surname, String pesel, Address address, Department department) {
        super(id, name, surname, pesel, address, department, EmployeeRole.TEAM_LEADER);

    }

    @Override
    public String toString() {
        return "Team Leader" + super.toString();
    }
}
