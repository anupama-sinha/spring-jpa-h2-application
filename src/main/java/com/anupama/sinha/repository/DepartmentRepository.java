package com.anupama.sinha.repository;

import com.anupama.sinha.model.Department;
import com.anupama.sinha.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
