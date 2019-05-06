package com.sudip.jpa.jpahibernate.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.sudip.jpa.jpahibernate.entity.Currency;

@Repository
public class CurrencyRepository {

	@PersistenceContext
	EntityManager entitymanager;
	
	public List<Currency> getAllAvailableCCU(){
		Query query = entitymanager.createNativeQuery("Select * from CURRENCY",Currency.class);
		List<Currency> list = query.getResultList();
		return list;
	}
}
