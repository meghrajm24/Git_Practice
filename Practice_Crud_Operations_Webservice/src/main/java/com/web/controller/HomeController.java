package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.home_service_interface.Home_Service_Interface;
import com.web.model.Employee;

@RestController
public class HomeController 
{
	@Autowired
	Home_Service_Interface hsi;
	
	@PostMapping("/insertdata")
	public String addData(@RequestBody Employee e)
	{
		hsi.saveData(e);
		return "Data Saved";
	}
	
	@GetMapping("/getsingledata/{username}/{password}")
	public Employee singledata(@PathVariable("username")String un,
			@PathVariable("password")String pass)
	{
		Employee e = hsi.singledata(un,pass);
		return e;
	}
	
	@GetMapping("/alldata")
	public Iterable<Employee> allData()
	{
		Iterable<Employee> data = hsi.allData();
		return data;
	}
	
	@PutMapping("/update/{eid}")
	public String Update(@PathVariable("eid")int eid, @RequestBody Employee e)
	{
		hsi.saveData(e);
		return "Data Updated";
	}
	
	@DeleteMapping("/delete/{eid}")
	public String Delete(@PathVariable("eid")int eid)
	{
		hsi.deleteData(eid);
		return "Data Deleted";
	}

}
