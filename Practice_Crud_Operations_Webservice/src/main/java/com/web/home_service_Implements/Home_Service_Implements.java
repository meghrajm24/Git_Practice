package com.web.home_service_Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.home_repository.Home_Repository_Interface;
import com.web.home_service_interface.Home_Service_Interface;
import com.web.model.Employee;

@Service
public class Home_Service_Implements implements Home_Service_Interface
{
	@Autowired
	Home_Repository_Interface hr;

	@Override
	public Employee singledata(String username, String password) {
		
		return hr.findAllByUsernameAndPassword(username, password);
	}

	@Override
	public void saveData(Employee e) {
		hr.save(e);
		
	}

	@Override
	public Iterable<Employee> allData() {
		
		return hr.findAll();
	}

	@Override
	public void deleteData(int eid) {
		Employee e = hr.findAllByEid(eid);
		
		hr.delete(e);
		
	}
	
	

	

}
