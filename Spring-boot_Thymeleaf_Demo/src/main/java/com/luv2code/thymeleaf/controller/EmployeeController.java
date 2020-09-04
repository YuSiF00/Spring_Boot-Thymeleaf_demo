package com.luv2code.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.thymeleaf.entity.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private List<Employee> employees;

	@PostConstruct
	public void loadData() {
        employees = new ArrayList<Employee>();

		Employee employee1 = new Employee(1,"Yusif", "Memmedov","yusifmemmedov553@gmail.com");
		Employee employee2 = new Employee(2,"Cavidan", "Abdullayev","cavidan5889@gmail.com");
		Employee employee3 = new Employee(3,"Kenan", "Sultanov","kenansu1lanov@gmail.com");

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

	}
	
	@GetMapping("/list")
	public String ListEmployee(Model theModel) {
		
		theModel.addAttribute("employees",employees);
		
		return "list-employees";
	}
	
	
	
	
	
	
	
}
