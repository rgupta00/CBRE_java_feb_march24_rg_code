package com.session2.demo1.c.relationship_bw_objects.inh;
//POJO
public class Employee {
    private int id;
    private String name;
    private double salary;//Why BD?

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printEmployeeDetails(){
        System.out.println("id :"+ id);
        System.out.println("Name :"+ name);
        System.out.println("Salary :"+ salary);
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Why? StringBuilder not string catnation
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
