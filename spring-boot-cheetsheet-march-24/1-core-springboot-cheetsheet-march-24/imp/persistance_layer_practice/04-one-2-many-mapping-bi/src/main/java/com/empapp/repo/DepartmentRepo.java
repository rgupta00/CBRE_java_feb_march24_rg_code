package com.empapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empapp.entities.Department;
import com.empapp.entities.Employee;
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}

