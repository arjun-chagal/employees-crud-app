package com.crud.employees.employees_crud.controller;


import com.crud.employees.employees_crud.DAO.EmployeeDAO;
import com.crud.employees.employees_crud.Entity.Employee;
import com.crud.employees.employees_crud.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class Rest {
    EmployeeService employeeService;


    public Rest(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/")
    public List<Employee> retriveAll(){

        return employeeService.findAll();

    }
}
