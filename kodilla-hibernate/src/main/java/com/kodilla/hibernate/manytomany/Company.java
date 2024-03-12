package com.kodilla.hibernate.manytomany;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.findByFirstThreeCharacters",
        query = "SELECT * FROM COMPANIES WHERE SUBSTRING(COMPANY_NAME, 1, 3) = :prefix",
        resultClass = Company.class
)
@Entity
@Table(name = "COMPANIES")
public class Company {

    @Id
    @GeneratedValue
    @Column(name = "COMPANY_ID", unique = true)
    private int id;

    @NotNull
    @Column(name = "COMPANY_NAME")
    private String name;

    @ManyToMany(mappedBy = "companies")
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
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

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.getCompanies().add(this);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
        employee.getCompanies().remove(this);
    }
}