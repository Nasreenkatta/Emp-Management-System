package com.pro.emp_management_sys.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pro.emp_management_sys.model.Employee;
import com.pro.emp_management_sys.service.empservice;

@Controller
public class empcontrollers {
@Autowired
private empservice empserv;
@GetMapping("/")
public String viewhomepage(Model model) {
	model.addAttribute("allemplist", empserv.getallemployees());
	return "index";
}
@GetMapping("/add")
public String addemployees(Model model) {
	Employee emp= new Employee();
	model.addAttribute("employee", emp);
	return "addEmployee";
}
@PostMapping("/save")
public String saveemployee(@ModelAttribute("employee") Employee employee) {
	empserv.save(employee);
	return "redirect:/";
}
@PostMapping("/updateform/id")
public String updateform(@PathVariable("id") int empid, Model model) {
	Employee emp= empserv.getbyid(empid);
	model.addAttribute("employee", employee);
	return "update";
	
}

@GetMapping("/delete/{id}")
public String deletebyid(@PathVariable("id") int empid) {
	empserv.deletebyid(empid);
	return "redirect:/";
}















}
