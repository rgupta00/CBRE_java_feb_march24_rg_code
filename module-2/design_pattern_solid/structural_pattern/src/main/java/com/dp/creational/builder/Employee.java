package com.dp.creational.builder;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Employee {
    private int id;
    private String name;
    private double salary;

}
