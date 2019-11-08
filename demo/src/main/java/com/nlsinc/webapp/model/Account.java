package com.nlsinc.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long actno;
	@Column(name="custname")
	private String custName;
	@Column(name="balance")
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account( String custName, double balance) {
		
		
		this.custName = custName;
		this.balance = balance;
	}
	public long getActno() {
		return actno;
	}
	public void setActno(long actno) {
		this.actno = actno;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [actno=" + actno + ", custName=" + custName + ", balance=" + balance + "]";
	}
	
	

}
