package com.codyend.uni_api.model;

import com.codyend.uni_api.model.enumeration.EmployeeType;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.math.BigDecimal;

@Entity
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "person_id")
public class Employee extends Person{
    private BigDecimal salary;
    @Column(name = "employee_type")
    @Enumerated(EnumType.STRING)
    private EmployeeType employeeType;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "building_id")
    private Building building;

    public Employee() {
    }

    public Employee(Long id, String name, String lastName, String dni, Address address, BigDecimal salary, EmployeeType employeeType) {
        super(id, name, lastName, dni, address);
        this.salary = salary;
        this.employeeType = employeeType;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
}
