package com.employeeapp.repo;

import com.employeeapp.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    //CRUD
    public List<Employee> findByDepartmentDname(String departmentName);

    //i want to find out all the emp of in clause 1, 5,6

    @Query("SELECT e FROM Employee e WHERE e.eid IN (:eid)")
    public List<Employee> findEmployoeeByIds( @Param("eid") List<Integer> ids);
}
