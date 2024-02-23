package com.empapp.basics;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//how hib come to know about this class
//actually hibernate manage the life cycle of object
//entity -> pojo with @Enitity @Id
@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String address;
    private String city;
    private String country;

    public Address(String address, String city, String country) {
        this.address = address;
        this.city = city;
        this.country = country;
    }
}
