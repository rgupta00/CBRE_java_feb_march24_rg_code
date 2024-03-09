package com.empapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empapp.entities.Project;
@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer> {

}

