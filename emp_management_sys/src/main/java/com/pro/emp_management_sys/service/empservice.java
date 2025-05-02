package com.pro.emp_management_sys.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pro.emp_management_sys.model.Employee;
@Service
public interface empservice {
List<Employee> getallemployees();
void save(Employee employee);
Employee getbyid(int empid);
void deletebyid(int empid);

}
