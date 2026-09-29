package com.Emplyoee.Bandaru.Enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Emplyoee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank (message = "First Name is Required,") 
	@Pattern (regexp = "^[A-Za-z]+$", message="Name should contain Letters")
	private String firstname;
	@NotBlank (message = "First Name is Required,") 
	@Pattern (regexp = "^[A-Za-z]+$", message="Name should contain Letters")
	private String lastname;
	@NotBlank (message = "Domain is Required")
	private String domain;
	@NotBlank (message = "Location is Required")
	private String location;
}
