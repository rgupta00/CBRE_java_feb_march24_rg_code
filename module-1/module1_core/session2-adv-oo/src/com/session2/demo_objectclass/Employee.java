package com.session2.demo_objectclass;

import java.util.Objects;
import java.util.StringJoiner;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }
//    public void print(){
//        System.out.println("id : "+ id);
//        System.out.println("name: "+ name);
//        System.out.println("salary: "+ salary);
//    }

    //No need to define a method like print()

    @Override
    public String toString() {
        //String class in java
        return "id: "+id +" name: "+name+"salary: "+ salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    //hashing ?
    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
}
