package com.sda.javaoop.departmentEnum;

import java.util.ArrayList;
import java.util.Objects;

public class Company {
    private int id;
    private Address address;
    private String name;
    private ArrayList<Employee> employees;


    public Company(int id, Address address, String name) {
        this.id = id;
        this.address = new Address(address);
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", address=" + address +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company company)) return false;
        return id == company.id
                && Objects.equals(address, company.address)
                && Objects.equals(name, company.name);
        // && Objects.equals(employees, company.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address /*, employees*/);
    }
}
