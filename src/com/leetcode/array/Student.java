package com.leetcode.array;

import java.util.*;
import java.util.stream.Collectors;

public class Student implements Comparable {
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getStudentage() {
        return studentage;
    }
    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    @Override
    public int compareTo(Object o) {
        Student s1= (Student) o;
        if(s1.rollno > this.rollno)
            return -1;
        if(s1.rollno < this.rollno)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentname='" + studentname + '\'' +
                ", rollno=" + rollno +
                ", studentage=" + studentage +
                '}';
    }

    public static void main(String args[]){
                ArrayList<Student> arraylist = new ArrayList<Student>();
                arraylist.add(new Student(223, "Chaitanya", 26));
                arraylist.add(new Student(245, "Rahul", 24));
                arraylist.add(new Student(209, "Ajeet", 32));

                Collections.sort(arraylist, Comparator.comparingInt(Student::getRollno));
      String st=  arraylist.stream()
                .sorted(Comparator.comparingInt(Student::getRollno))
                .map(Student::getStudentname)
                .limit(3)
                .collect(Collectors.joining(","));

        /*System.out.println(st);


        for(Student str: arraylist){
                    System.out.println(str);
                }*/

        Map<String,Integer> map = new HashMap<>();
        map.put("Abhi1",1);
        map.put("Abhi2",3);
        map.put("Abhi3",5);
        map.put("Abhi4",7);
        map.put("Abhi5",9);
        map.put("Abhi6",4);
        map.put("Abhi7",2);
        List list  = Arrays.asList("Abhi1","Abhi5","Abhi6","Abhi4");
        List<String> l1 = getSortedUser(list,map) ;

    }

    private static List<String> getSortedUser(List<String> list,Map<String,Integer> map) {

       return list.stream()
               .map((li) -> new Emp(map.get(li),li))
               .sorted(Comparator.comparing(Emp::getName))
               .map(Emp::getName)
               .collect(Collectors.toList());
    }
}
