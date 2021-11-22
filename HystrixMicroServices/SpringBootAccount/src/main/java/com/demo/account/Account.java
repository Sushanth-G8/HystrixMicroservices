package com.demo.account;



public class Account {
	
	
	private Integer empId;
	private String accountId;
	private String branch;
	public Account(Integer empId, String accountId, String branch) {
		super();
		this.empId = empId;
		this.accountId = accountId;
		this.branch = branch;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Account [empId=" + empId + ", accountId=" + accountId + ", branch=" + branch + "]";
	}
	

}
