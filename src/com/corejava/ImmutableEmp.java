package com.corejava;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class ImmutableEmp {

    private final int id;
    private final String name;
    private final Date dob;

    public ImmutableEmp(int id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = (Date) dob.clone();
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getDob() {
        return dob;
    }

    public static void main(String[] args) {
        Date dtt =new Date();
        ImmutableEmp emp=new ImmutableEmp(1,"a",dtt);
        System.out.println(emp.getDob());
        dtt.setMonth(6);
        System.out.println(emp.getDob());

        Map<String,String> m1 = new HashMap<>();



    }
}
