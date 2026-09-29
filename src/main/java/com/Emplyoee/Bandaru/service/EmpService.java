package com.Emplyoee.Bandaru.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Emplyoee.Bandaru.Enitity.*;
import com.Emplyoee.Bandaru.Repo.Repo;

@Service
public class EmpService {
	private final Repo repo;

	public EmpService(Repo repo) {
		this.repo = repo;
	}

	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
	}

	public void delteStudent(int id) {
		repo.deleteById(id);
	}

    public List<Employee> getEmployees(Employee e) {
    return repo.findAll();
    }

    public Employee updateEmployee(int id, Employee emp) {
      Employee exsisting=repo.findById(id).orElseThrow(()-> new RuntimeException("Emp not found"+id));
	  if (emp.getFirstname()!=null) exsisting.setFirstname(emp.getFirstname());
	  if(emp.getLastname()!=null) exsisting.setLastname(emp.getLastname());
	  if(emp.getLocation()!=null) exsisting.setLocation(emp.getLocation());
	  if(emp.getDomain()!=null) exsisting.setDomain(emp.getDomain());
	  return repo.save(exsisting);
	  }

    public List<Employee> findByDomainName(String domain) {
        return repo.findByDomain(domain);
    }

}

