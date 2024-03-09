package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empapp.entities.Employee;
import com.empapp.entities.Project;
import com.empapp.repo.EmployeeRepo;
import com.empapp.repo.ProjectRepo;

@SpringBootApplication
public class One2OneMappingApplication implements CommandLineRunner {

//	@Autowired
//	private ProjectRepo projectRepo;
//	@Autowired
//	private EmployeeRepo employeeRepo;

	public static void main(String[] args) {
		SpringApplication.run(One2OneMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Employee employee1 = new Employee("raja");
//		Employee employee2 = new Employee("amit");
//
//		Employee employee3 = new Employee("sumit");
//		Employee employee4 = new Employee("ekta");
//
//		Employee employee7 = new Employee("rajiv");
//		Employee employee8 = new Employee("nitin");
//
//		
//		Project project1 = new Project("proj A");
//		Project project2 = new Project("proj B");
//
//		Project project3 = new Project("proj C");
//		Project project4 = new Project("proj D");
//
//		project1.getEmployees().add(employee1);
//		project1.getEmployees().add(employee3);
//
//		project2.getEmployees().add(employee1);
//		project2.getEmployees().add(employee3);
//		project2.getEmployees().add(employee4);
//
//		project3.getEmployees().add(employee2);
//		project3.getEmployees().add(employee3);
//		project3.getEmployees().add(employee4);
//
//		project4.getEmployees().add(employee2);
//		project4.getEmployees().add(employee4);
//
//		employee1.getProjects().add(project1);
//		employee1.getProjects().add(project2);
//
//		employee2.getProjects().add(project3);
//		employee2.getProjects().add(project4);
//
//		employee3.getProjects().add(project1);
//		employee3.getProjects().add(project2);
//		employee3.getProjects().add(project3);
//
//		employee4.getProjects().add(project4);
//		employee4.getProjects().add(project2);
//		employee4.getProjects().add(project3);
//		
//		
//
//		projectRepo.save(project1);
//		projectRepo.save(project2);
//		projectRepo.save(project3);
//		projectRepo.save(project4);
//
//		employeeRepo.save(employee1);
//		employeeRepo.save(employee2);
//		employeeRepo.save(employee3);
//		employeeRepo.save(employee4);
//		
//		employeeRepo.save(employee7);
//		employeeRepo.save(employee8);
//		
//		System.out.println("added...");

	}

}
