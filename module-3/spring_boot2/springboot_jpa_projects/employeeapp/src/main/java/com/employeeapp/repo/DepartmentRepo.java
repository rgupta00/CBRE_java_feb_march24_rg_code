package com.employeeapp.repo;

import com.employeeapp.dto.DeptEmpResponse;
import com.employeeapp.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {
    // name  salary dname//HQL
    @Query("SELECT new com.employeeapp.dto.DeptEmpResponse(e.name, e.salary, d.dname) FROM Department d INNER JOIN d.employees e")
    public List<DeptEmpResponse> deptEmpInforation();

    //find the details of all employees of an particular dept : sales

    //get the dept where no emp is assignment

    //CRUD
}















