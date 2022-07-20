package com.java8;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private String deptId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && sal == employee.sal && Objects.equals(name, employee.name) && Objects.equals(deptId, employee.deptId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptId='" + deptId + '\'' +
                ", sal=" + sal +
                '}';
    }

    private int sal;

    public Employee(int id, String name, String deptId, int sal) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
        this.sal = sal;
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

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
