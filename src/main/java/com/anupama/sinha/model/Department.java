package com.anupama.sinha.model;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

    @Column(name = "deptId", nullable = false)
    @Id
    Integer deptId;

    @Column(name = "deptName", nullable = false)
    String deptName;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
