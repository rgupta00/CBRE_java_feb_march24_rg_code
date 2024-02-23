package com.empapp.moreann;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

//how hib come to know about this class
//actually hibernate manage the life cycle of object
//entity -> pojo with @Enitity @Id
@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "employee_table_new")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eid")
    private int id;
    @Column(name = "ename", nullable = false)
    private String name;
    @Column(name = "salary", nullable = false)
    private double salary;

    @Column(name = "dept", nullable = false)
    private String dept;

    @Transient      //only in the memory
    private String tempPassword;

    private LocalDate date;

    @Temporal(TemporalType.DATE)
    private Date dob;

    @Temporal(TemporalType.TIMESTAMP)
    private Date loginTime;

    @Enumerated(EnumType.STRING)
    private EmpType empType;


    public Employee(String name, double salary, String dept, String tempPassword, Date dob, Date loginTime, EmpType empType) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.tempPassword = tempPassword;
        this.dob = dob;
        this.loginTime = loginTime;
        this.empType = empType;
    }
}
