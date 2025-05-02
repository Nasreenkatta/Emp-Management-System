package com.pro.emp_management_sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.emp_management_sys.model.Employee;

@Repository
public interface emprepository extends JpaRepository<Employee, Integer>{

}
