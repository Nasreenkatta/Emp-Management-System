package com.pro.emp_management_sys.service;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.pro.emp_management_sys.model.Employee;
import com.pro.emp_management_sys.repository.emprepository;

@Service
public class empserviceimpl implements empservice {
@Autowired
private emprepository emprepo;

@Override
public List<Employee> getallemployees() {
	
	return emprepo.findAll();
}

@Override
public void save(Employee employee) {
	if(Objects.nonNull(employee)) {
		emprepo.save(employee);
	}
	
}

@Override
public Employee getbyid(int empid) {
	return emprepo.findById(empid).orElse(null);
	
}

@Override
public void deletebyid(int empid) {
	if(Objects.nonNull(empid)) {
		emprepo.deleteById(empid);
	}
	
}

}
