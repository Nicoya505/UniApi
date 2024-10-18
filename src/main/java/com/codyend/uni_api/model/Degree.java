package com.codyend.uni_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "degrees")
public class Degree extends BaseEntity implements Serializable {
    @Column(nullable = false, unique = true)
    private String name;
    @Column(name = "number_of_subjects")
    private int numberOfSubjects;
    @Column(name = "number_of_years")
    private int numberOfYears;
    @OneToMany(
            mappedBy = "degree",
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JsonIgnoreProperties({"degree"})
    private List<Student> students;
    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "degrees_professors",
            joinColumns = @JoinColumn(name = "degree_id"),
            inverseJoinColumns = @JoinColumn(name = "professor_id")
    )
    @JsonIgnoreProperties({"degrees"})
    private List<Professor> professors;

    public Degree() {
    }

    public Degree(Long id, String name, int numberOfSubjects, int numberOfYears) {
        this.name = name;
        this.numberOfSubjects = numberOfSubjects;
        this.numberOfYears = numberOfYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Degree degree = (Degree) o;
        return numberOfSubjects == degree.numberOfSubjects && numberOfYears == degree.numberOfYears && Objects.equals(name, degree.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfSubjects, numberOfYears);
    }
}
