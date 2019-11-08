package com.nlsinc.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nlsinc.webapp.model.Account;


// DAO - Data Access Object
// JDBCTemplate 
// Hibernate - HibearnateTemplate
public interface AccountRepo extends  JpaRepository<Account, Long>{

}
