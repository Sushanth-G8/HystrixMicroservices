package com.demo.account;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping(value="/accounts/{empId}")
	public List<Account> getAccountsById(@PathVariable int empId){
		
		
	    List<Account> accounts = accountService.findAccountsByEmpId(empId);
	    System.out.println(accounts);
	    return accounts; 
		
	}

}
