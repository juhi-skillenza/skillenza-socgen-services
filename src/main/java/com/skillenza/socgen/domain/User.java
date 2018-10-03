package com.skillenza.socgen.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class User {

	@Id
	private String id;

	private String firstName;
	private String lastName;
	private String gender;
	private Date dob;
	private String department;

}

