package com.anupama.sinha.model;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Column(name = "empid",nullable = false)
    @Id
    Integer empid;

    @Column(name = "empname",nullable = false)
    String empname;

    @ManyToOne
    @JoinColumn(name = "deptid", referencedColumnName = "deptid")
    private Department department;

    public Integer getId() {
        return empid;
    }

    public void setId(Integer id) {
        this.empid = id;
    }

    public String getName() {
        return empname;
    }

    public void setName(String name) {
        this.empname = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}