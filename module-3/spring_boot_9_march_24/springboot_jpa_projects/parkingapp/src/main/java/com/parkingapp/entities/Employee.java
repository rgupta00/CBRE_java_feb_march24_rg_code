package com.parkingapp.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "emp_table")
public class Employee  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String empName;

    @JoinColumn(name = "pid_fk")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Parking parking;

}













