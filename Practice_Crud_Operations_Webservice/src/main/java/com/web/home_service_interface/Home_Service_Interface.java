package com.web.home_service_interface;

import com.web.model.Employee;

public interface Home_Service_Interface 
{
	public Employee singledata(String username, String password); 

	public void saveData(Employee e);
	
	public Iterable<Employee> allData();
	
	public void deleteData(int eid);
}
