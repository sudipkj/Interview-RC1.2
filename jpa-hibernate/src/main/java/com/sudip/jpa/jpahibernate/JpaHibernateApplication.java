package com.sudip.jpa.jpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sudip.jpa.jpahibernate.repository.EmployeeRepository;

@SpringBootApplication
public class JpaHibernateApplication implements CommandLineRunner{
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeRepo.insertEmployeeSIngleTable();
	}

	
}
