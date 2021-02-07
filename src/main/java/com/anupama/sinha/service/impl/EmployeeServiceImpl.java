package com.anupama.sinha.service.impl;

import com.anupama.sinha.model.Department;
import com.anupama.sinha.model.Employee;
import com.anupama.sinha.repository.DepartmentRepository;
import com.anupama.sinha.repository.EmployeeRepository;
import com.anupama.sinha.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Employee save(Employee employee) {
//        Department department = new Department(11,"Computer Science",2);
//        departmentRepository.save(department);
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepository.findById(id).get();
    }
}
