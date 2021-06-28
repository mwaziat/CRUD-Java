package com.scaleup.java003.controller;

import com.scaleup.java003.model.Employee;
import com.scaleup.java003.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employeeReq) {

        Employee employee = employeeService.saveEmployee(employeeReq);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<Employee>> listEmployee(){
        List<Employee> lists = employeeService.listEmployee();
        return new ResponseEntity<>(lists, HttpStatus.OK);
    }

    @GetMapping("list")
    public ResponseEntity<List<Employee>> listEmployeeByStatus(){
        List<Employee> lists = employeeService.listEmployeeByStatus();
        return new ResponseEntity<>(lists, HttpStatus.OK);
    }

    @GetMapping("{employeeId}")
    public ResponseEntity<Employee> findEmployeeById(@PathVariable("employeeId") Integer employeeId) {
        Employee employee = employeeService.findEmployeeById(employeeId);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    // U - PUT
    @PutMapping("{employeeId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("employeeId") Integer employeeId,
                                                   @RequestBody Employee employeeReq) {
        Employee employee = employeeService.updateEmployee(employeeId, employeeReq);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @DeleteMapping("{employeeId}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("employeeId") Integer employeeId){
        Employee employee = employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

}
