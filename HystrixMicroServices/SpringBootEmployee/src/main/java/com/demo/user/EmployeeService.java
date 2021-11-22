package com.demo.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class EmployeeService {
	
	@Autowired
	private RestTemplate restTemplate;
    
	
	@HystrixCommand(fallbackMethod = "defaultAccounts")
	public List<Account> showEmployees(int id) {
		// TODO Auto-generated method stub
		
		System.out.println(id);
		List<Account> accounts = restTemplate.exchange("http://ACCOUNT/accounts/{empId}", HttpMethod.GET, null, new
		        ParameterizedTypeReference<List<Account>>(){},id).getBody();
		
		
		return accounts;
	}
	
	public List<Account> defaultAccounts(int id){
		
		 return Arrays.asList(new Account(12,"Ac12","INA"));
		
	}

}
