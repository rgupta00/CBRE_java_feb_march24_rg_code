package com.dp.creational.builder;

public class DemoBuilder {
    public static void main(String[] args) {

        Employee employee=new Employee.EmployeeBuilder().salary(67000).name("rajiv").build();
        System.out.println(employee);

    }
}
