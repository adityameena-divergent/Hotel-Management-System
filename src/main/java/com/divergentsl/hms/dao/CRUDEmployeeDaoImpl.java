package com.divergentsl.hms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.divergentsl.hms.entity.Employee;

@Repository
public class CRUDEmployeeDaoImpl implements CRUDEmployeeDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void add(Employee employee) {
		em.persist(employee);
	}

}
