package com.example.casestudy.model.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public Position() {
    }

    public Position(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @OneToMany(mappedBy = "position",cascade = CascadeType.ALL)
    private Set<Employee> employees;

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

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
