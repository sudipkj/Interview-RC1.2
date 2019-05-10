package com.sudip.jpa.jpahibernate.repository;

import java.io.IOException;
import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sudip.jpa.jpahibernate.entity.Employee;
import com.sudip.jpa.jpahibernate.entity.FullTimeEmployee;
import com.sudip.jpa.jpahibernate.entity.PartTimeEmployee;

@Repository
@Transactional(isolation=Isolation.SERIALIZABLE, propagation=Propagation.REQUIRED, rollbackFor=Exception.class, noRollbackFor=IOException.class)
public class EmployeeRepository {
	
	@PersistenceContext
	EntityManager em;

	
	public void insertEmployeeSIngleTable() {
		Employee partTimeemployee = new PartTimeEmployee("Sudip Kumar Jana", new BigDecimal("500"));
		Employee fullTimeemployee = new FullTimeEmployee("Pooja Singh", new BigDecimal("15000"));
		em.persist(partTimeemployee);
		em.persist(fullTimeemployee);
	}
}
