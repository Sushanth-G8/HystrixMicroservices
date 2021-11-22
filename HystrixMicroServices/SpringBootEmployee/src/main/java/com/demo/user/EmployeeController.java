package com.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="/employees/{id}")
	 public List<Account> showEmployees(@PathVariable("id") int id) {     
		    List<Account> accounts = employeeService.showEmployees(id);
		    // displaying accounts
		    for(Account acct : accounts) {
		      System.out.println(acct.getEmpId());
		      System.out.println(acct.getAccountId());
		      System.out.println(acct.getBranch());
		    }
		    return accounts;          
		  }
	

}
