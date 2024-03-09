package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empapp.entities.Employee;
import com.empapp.entities.Parking;
import com.empapp.repo.EmployeeRepo;
import com.empapp.repo.ParkingRepo;

@SpringBootApplication
public class One2OneMappingApplication implements CommandLineRunner {

	@Autowired
	private ParkingRepo parkingRepo;
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(One2OneMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Employee employee1 = new Employee("sumit");
		Employee employee2 = new Employee("ekta");
		Employee employee3 = new Employee("gun");
		Employee employee4 = new Employee("keshav");
		Employee employee5 = new Employee("vikas");

		Parking parking1 = new Parking("A12");
		Parking parking2 = new Parking("M2");
		Parking parking3 = new Parking("B2");
		Parking parking4 = new Parking("T11");
		Parking parking5 = new Parking("U12");

		parking1.setEmployee(employee1);
		parking2.setEmployee(employee2);
		parking3.setEmployee(employee3);
		parking4.setEmployee(employee4);
		parking5.setEmployee(employee5);
//		
		employee1.setParking(parking1);
		employee2.setParking(parking2);
		employee3.setParking(parking3);
		employee4.setParking(parking4);
		employee5.setParking(parking5);
		
		
		employeeRepo.save(employee1);
		employeeRepo.save(employee2);
		employeeRepo.save(employee3);
		employeeRepo.save(employee4);
		employeeRepo.save(employee5);
		
		parkingRepo.save(parking1);
		parkingRepo.save(parking2);
		parkingRepo.save(parking3);
		parkingRepo.save(parking4);
		parkingRepo.save(parking5);
	
	
		

	}

}
