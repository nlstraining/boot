package com.nlsinc.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nlsinc.webapp.model.Account;
import com.nlsinc.webapp.repositories.AccountRepo;

@RestController
@RequestMapping("/bank")
public class AccountController {
	
    @Autowired  
 	AccountRepo repo;
	
	public AccountController(AccountRepo repo) {
		
		this.repo = repo;
	}

	static private List<Account> list = new ArrayList<>();
	
	static {
		
		Account a1 = new Account("Abc",1200.87);
		Account a2 = new Account("PQR", 78000.45);
		Account a3 = new Account("XYZ",43500.75);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		
	}
	
    @GetMapping()
    public List<Account> giveList(){
    	
    	repo.saveAll(list);
    	return list;
    }
	
	
	
	
}
