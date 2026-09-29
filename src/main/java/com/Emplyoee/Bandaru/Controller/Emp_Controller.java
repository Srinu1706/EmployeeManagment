package com.Emplyoee.Bandaru.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Emplyoee.Bandaru.Enitity.Employee;
import com.Emplyoee.Bandaru.service.EmpService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class Emp_Controller {
	private final EmpService empservice;

	public Emp_Controller(EmpService empservice) {
		this.empservice = empservice;
	}

	@PostMapping
	public Employee addEmployee(@Valid @RequestBody Employee employee) {
		return empservice.addEmployee(employee);
	}

	@DeleteMapping("/{id}")
	public String DeletEmp(@PathVariable int id) {
		empservice.delteStudent(id);
		return "Student Deleted Sucesfully";
	}

	@GetMapping 
	public List<Employee> GetAllEmployees(Employee e){
		return empservice.getEmployees(e);
	}

	@PatchMapping ("/{id}")
	public Employee UpdateEmp(@PathVariable int id , @RequestBody Employee emp){
		return empservice.updateEmployee(id,emp);
	}
	@GetMapping ("/Domain/{domain}")
	public List<Employee> GetByDomainName(@PathVariable String domain){
		return empservice.findByDomainName(domain);

	}
}
