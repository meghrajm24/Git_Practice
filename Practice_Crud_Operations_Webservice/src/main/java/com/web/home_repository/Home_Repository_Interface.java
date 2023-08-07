package com.web.home_repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Employee;

@Repository
public interface Home_Repository_Interface extends CrudRepository<Employee, Integer>
{
	public Employee findAllByUsernameAndPassword(String username,String password);

	public Employee findAllByEid(int eid);
	

}
