package com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class EmployeeStreamDemo {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList();

        list.add(new Employee(1,"A","1",1000));
        list.add(new Employee(2,"B","1",4000));
        list.add(new Employee(3,"C","2",1000));
        list.add(new Employee(4,"D","3",2000));
        list.add(new Employee(5,"E","2",1000));

        System.out.println(list.get(1).equals(list.get(2)));

        Map<String,List<Employee>> empDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));
        empDept.entrySet().forEach(entry-> System.out.println(entry.getKey()+":"+entry.getValue()));

        Optional<Employee> maxSal = list.stream().max(Comparator.comparing(Employee::getSal));
        Optional<Employee> minSal = list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSal)));
        System.out.println(maxSal+":"+minSal);

        Map<String, Optional<Employee>> maxSalByDept = list.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.maxBy(Comparator.comparing(Employee::getSal))));

        maxSalByDept.forEach((k,v)-> System.out.println(k+":"+v));
    }
}
