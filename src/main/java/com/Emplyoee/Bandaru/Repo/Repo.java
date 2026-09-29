package com.Emplyoee.Bandaru.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Emplyoee.Bandaru.Enitity.Employee;
@Repository
public interface Repo extends JpaRepository<Employee, Integer> {
	List<Employee>findByDomain(String Domain);
}
