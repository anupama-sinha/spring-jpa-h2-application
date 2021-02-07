package com.anupama.sinha.controller;

import com.anupama.sinha.model.Employee;
import com.anupama.sinha.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employee/{id}")
    Employee getEmployee(@PathVariable Integer id){
        return  employeeService.findById(id);
    }

    @PostMapping(value = "/employee")
    Employee addEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

}
