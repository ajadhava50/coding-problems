package com.corejava;

public class Emp1 {
    private String name;
    public Emp1(String abhi) {
        this.name=abhi;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Emp1{" +
                "name='" + name + '\'' +
                '}';
    }
}
