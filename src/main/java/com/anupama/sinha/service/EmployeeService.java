package com.anupama.sinha.service;

import com.anupama.sinha.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    Employee findById(Integer id);
}
