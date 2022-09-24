package com.sda.javaoop.departmentEnum;

import java.util.Objects;

public abstract class Employee implements Workable{

    private int id;
    private String name;
    private String surname;
    private String pesel;
    private Address address = new Address();
    private Department department;
    private EmployeeRole employeeRole;

    public Employee(int id, String name, String pesel, Address address) {
        this.id = id;
        this.name = name;
        this.pesel = pesel;
        this.address = new Address(address);
    }

    public Employee(int id, String name, String surname, String pesel, Address address, Department department, EmployeeRole employeeRole) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.address = address;
        this.department = department;
        this.employeeRole = employeeRole;
    }

    public boolean doWork(){
        return true;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id
                && pesel.equals(employee.pesel)
                && Objects.equals(name, employee.name)
                && Objects.equals(surname, employee.surname)
                && Objects.equals(address, employee.address)
                && department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, pesel, address, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", address=" + address +
                ", department=" + department +
                '}';
    }
}
