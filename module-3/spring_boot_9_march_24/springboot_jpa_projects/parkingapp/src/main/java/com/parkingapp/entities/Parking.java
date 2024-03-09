package com.parkingapp.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "parking_table")
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int parkingId;
    private String parkingLocation;

    @OneToOne(mappedBy = "parking")
    private Employee employee;
}
