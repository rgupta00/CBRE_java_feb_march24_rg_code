package com.empapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empapp.entities.Parking;
@Repository
public interface ParkingRepo extends JpaRepository<Parking, Integer> {

}
