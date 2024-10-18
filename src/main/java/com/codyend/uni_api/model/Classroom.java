package com.codyend.uni_api.model;

import com.codyend.uni_api.model.enumeration.BoardType;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "classrooms")
public class Classroom extends BaseEntity implements Serializable {
    @Column(name = "classroom_number")
    private int classroomNumber;
    private String measurements;
    @Column(name = "number_of_desks")
    private int numberOfDesks;
    @Enumerated(EnumType.STRING)
    private BoardType board;
    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;

    public Classroom() {
    }

    public Classroom(int classroomNumber, String measurements, int numberOfDesks, BoardType board) {
        this.classroomNumber = classroomNumber;
        this.measurements = measurements;
        this.numberOfDesks = numberOfDesks;
        this.board = board;
    }

    public int getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(int classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public String getMeasurements() {
        return measurements;
    }

    public void setMeasurements(String measurements) {
        this.measurements = measurements;
    }

    public int getNumberOfDesks() {
        return numberOfDesks;
    }

    public void setNumberOfDesks(int numberOfDesks) {
        this.numberOfDesks = numberOfDesks;
    }

    public BoardType getBoard() {
        return board;
    }

    public void setBoard(BoardType board) {
        this.board = board;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroomNumber=" + classroomNumber +
                ", measurements='" + measurements + '\'' +
                ", numberOfDesks=" + numberOfDesks +
                ", board=" + board +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return classroomNumber == classroom.classroomNumber && numberOfDesks == classroom.numberOfDesks && Objects.equals(measurements, classroom.measurements) && board == classroom.board;
    }

    @Override
    public int hashCode() {
        return Objects.hash(classroomNumber, measurements, numberOfDesks, board);
    }
}
