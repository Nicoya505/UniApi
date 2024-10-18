package com.codyend.uni_api.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "professors")
@PrimaryKeyJoinColumn(name = "person_id")
public class Professor extends Person {

    private BigDecimal salary;
    @ManyToMany(mappedBy = "professors", fetch = FetchType.LAZY)
    private List<Degree> degrees;
    public Professor() {
    }

    public Professor(Long id, String name, String lastName, String dni, Address address, BigDecimal salary) {
        super(id, name, lastName, dni, address);
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public List<Degree> getDegrees() {
        return degrees;
    }

    public void setDegrees(List<Degree> degrees) {
        this.degrees = degrees;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tProfessor{" +
                "salary=" + salary +
                '}';
    }
}
