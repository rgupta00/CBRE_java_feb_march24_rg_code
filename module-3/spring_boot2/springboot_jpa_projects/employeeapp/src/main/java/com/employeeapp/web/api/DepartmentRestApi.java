package com.employeeapp.web.api;

import com.employeeapp.entities.Department;
import com.employeeapp.exceptions.ResouceNotFoundException;
import com.employeeapp.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class DepartmentRestApi {

    @Autowired
    private DepartmentRepo departmentRepo;

    @GetMapping(path = "departments")
    public ResponseEntity<List<Department>> getAll(){
        return ResponseEntity.ok().body(departmentRepo.findAll());
    }

    //get dept by id

    @GetMapping(path = "departments/{did}")
    public ResponseEntity<Department> getAll(@PathVariable(name="did") int did){
        return ResponseEntity.ok().body(departmentRepo
                .findById(did).orElseThrow(()-> new ResouceNotFoundException("dept with id "+ did+" is not found")));
    }


    //add new dept

    //update the dept . address

    //get dept by name

    //detete the dept

}
