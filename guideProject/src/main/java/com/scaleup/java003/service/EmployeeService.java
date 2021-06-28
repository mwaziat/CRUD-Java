package com.scaleup.java003.service;

import com.scaleup.java003.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> listEmployee = new ArrayList();

    public Employee saveEmployee(Employee employeeReq) {

        Employee employee = new Employee();
        employee.setId(employeeReq.getId());
        employee.setStatus(1);
        employee.setName(employeeReq.getName());
        employee.setTemp(employeeReq.getTemp());
        employee.setSleepHour(employeeReq.getSleepHour());

        listEmployee.add(employee);
        return employee;
    }

    public List<Employee> listEmployee() {
        return listEmployee;
    }

    public List<Employee> listEmployeeByStatus() {
        for (Employee employee: listEmployee){
            if (employee.getStatus() == 0) {
                return listEmployee;
            }
        }
        return null;
    }

    public Employee findEmployeeById(Integer employeeId) {

        for (Employee employee: listEmployee) {
            if (employeeId == employee.getId()) return employee;
        }
        return null;
    }

    public Employee updateEmployee(Integer employeeId, Employee employeeReq) {
        Employee employee = findEmployeeById(employeeId);
        employee.setName(employeeReq.getName());
        employee.setTemp(employeeReq.getTemp());
        employee.setSleepHour(employeeReq.getSleepHour());
        return employee;
    }

    public Employee deleteEmployee(Integer employeeId){
        Employee employee = findEmployeeById(employeeId);
        employee.setStatus(0);
        return employee;
    }

}
