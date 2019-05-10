package com.sudip.jpa.jpahibernate;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sudip.jpa.jpahibernate.entity.Employee;
import com.sudip.jpa.jpahibernate.entity.FullTimeEmployee;
import com.sudip.jpa.jpahibernate.entity.PartTimeEmployee;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=JpaHibernateApplication.class)
public class SingleTableHierarchyTest {

	@Autowired
	EntityManager em ;
	
	@Test
	@Transactional
	public void insertEmployeeSIngleTable() {
		Employee partTimeemployee = new PartTimeEmployee("Sudip Kumar Jana", new BigDecimal("500"));
		Employee fullTimeemployee = new FullTimeEmployee("Pooja Singh", new BigDecimal("15000"));
		em.persist(partTimeemployee);
		em.persist(fullTimeemployee);
	}
}
