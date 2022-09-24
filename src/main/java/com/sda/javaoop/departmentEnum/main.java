package com.sda.javaoop.departmentEnum;

public class main {

    public static void main(String[] args) {

        Address address0 = new Address("KOR 94", "Warsaw", "01-330");
        Address address1 = new Address("Prawa 12", "Szczno", "31-330");
        Address address2 = new Address("Lewa 12", "Szczno", "31-330");

        Employee teamleader1 = new TeamLeader(1,"Janusz", "Tracz", "98245512345", address0, Department.IT );

        Company company1 = new Company(0001, new Address("Sumia 45", "Rakow", "03-414"), "Karczex");

        company1.addEmployee(teamleader1);

        System.out.println("Company tostring(); " + company1.toString() + "\n");

        System.out.println(company1.getEmployees());

        Developer worker01 = new Developer(0001, "Adam", "Szpak", "32456235235", address2, Department.MARKETING);
        TeamLeader worker02 = new TeamLeader(0001, "Piotr", "Koza", "424151", address1, Department.ADMINISTRATION);

        company1.addEmployee(worker01);
        company1.addEmployee(worker02);

        System.out.println(company1.getEmployees());
    }

}
