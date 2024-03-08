package com.employeeapp.web.api;

import com.employeeapp.dto.DeptEmpResponse;
import com.employeeapp.dto.SelectedEmployeeRequest;
import com.employeeapp.entities.Department;
import com.employeeapp.entities.Employee;
import com.employeeapp.exceptions.ResouceNotFoundException;
import com.employeeapp.repo.DepartmentRepo;
import com.employeeapp.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class EmployeeRestApi {


    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping(path = "employees")
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok().body(employeeRepo.findAll());
    }

    @GetMapping(path = "employees/{eid}")
    public ResponseEntity<Employee> getById(@PathVariable(name = "eid") int eid){
        return ResponseEntity
                .ok()
                .body(employeeRepo.findById(eid)
                .orElseThrow(() -> new ResouceNotFoundException("emp with id "+ eid+" not found")));
    }

    @GetMapping(path = "empdeptinfo")
    public ResponseEntity<List<DeptEmpResponse>> getEmpDeptInfo(){
        return ResponseEntity.ok().body(departmentRepo.deptEmpInforation());
    }

//    //findEmployoeeByIds
//    @GetMapping(path = "selectedemployees")
//    public ResponseEntity<List<Employee>> findEmployoeeByIds( @RequestBody SelectedEmployeeRequest selectedEmployeeRequest){
//        List<Employee>employeesSelected=   employeeRepo.findEmployoeeByIds(selectedEmployeeRequest.getIds());
//
//        return ResponseEntity.status(HttpStatus.OK).body(employeesSelected);
//    }

    //http://localhost:8090/api/v1/selectedemployees?ids=1&ids=2
    //findEmployoeeByIds
    @GetMapping(path = "selectedemployees")
    public ResponseEntity<List<Employee>> findEmployoeeByIds( @RequestParam List<Integer> ids){
        List<Employee>employeesSelected=   employeeRepo.findEmployoeeByIds(ids);

        return ResponseEntity.status(HttpStatus.OK).body(employeesSelected);
    }


    //get all the emp

    //get only ename, salary , dname

    //get emp by id

    //add new emp

    //update the emp . salary

    //get emp by name

    //detete the emp
}
