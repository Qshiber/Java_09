package com.sda.javaoop.enumsEx;

import com.sda.javaoop.departmentEnum.Address;
import com.sda.javaoop.departmentEnum.Department;
import com.sda.javaoop.departmentEnum.Employee;
import com.sda.javaoop.departmentEnum.TeamLeader;

public class main {

    public static void main(String[] args) {

        Address address = new Address("KOR 94", "Warsaw", "01-330");
        Employee teamleader1 = new TeamLeader(1,"Janusz", "Tracz", "98245512345", address, Department.IT );

        System.out.println(teamleader1);

        System.out.println(teamleader1.getName());

        System.out.println(teamleader1.getId());

    }



}
