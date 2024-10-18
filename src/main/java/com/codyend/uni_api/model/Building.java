package com.codyend.uni_api.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "buildings")
public class Building extends BaseEntity implements Serializable {
    @Column(name = "square_meters")
    private Double squareMeters;
    @Column(nullable = false, unique = true)
    private String name;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="postalCode", column=@Column(name = "postal_code"))
    })
    private Address address;
    @OneToMany(
            mappedBy = "building",
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    private List<Classroom> classrooms;

    public Building() {
    }

    public Building(Double squareMeters, String name, Address address) {
        this.squareMeters = squareMeters;
        this.name = name;
        this.address = address;
    }

    public Double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(Double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(squareMeters, building.squareMeters) && Objects.equals(name, building.name) && Objects.equals(address, building.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(squareMeters, name, address);
    }
}
