package com.grayMatter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.grayMatter.model.Employee;

import jakarta.annotation.PostConstruct;

@RestController
public class MyController {
	
    private List<Employee> emplist;

    @PostConstruct 
    public void setupemplist() {
        emplist = new ArrayList<>();
        emplist.add(new Employee(2, "varma", 7800));
        emplist.add(new Employee(3, "ram", 7800));
        emplist.add(new Employee(4, "iran", 7800));
        emplist.add(new Employee(12, "mani", 7800));
    }

    // Create
    @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {  
        emplist.add(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    // Read (Get all Employees)
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(emplist, HttpStatus.OK);
    }

    // Read (Get Employee by ID)
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeByID(@PathVariable("id") int id) {
        for (Employee e : emplist) {
            if (e.getId() == id) {
                return new ResponseEntity<>(e, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Update
    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id, @RequestBody Employee updatedEmployee) {
        for (Employee e : emplist) {
            if (e.getId() == id) {
                e.setName(updatedEmployee.getName());
                e.setSalary(updatedEmployee.getSalary());
                return new ResponseEntity<>(e, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Delete
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int id) {
        for (Employee e : emplist) {
            if (e.getId() == id) {
                emplist.remove(e);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
