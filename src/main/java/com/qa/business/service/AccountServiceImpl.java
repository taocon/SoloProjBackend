package com.qa.business.service;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountRepository;
import com.qa.util.JSONUtil;

public class AccountServiceImpl implements AccountService {

	@Inject
	private AccountRepository repo;

	@Inject
	private JSONUtil util;


	public String getAllAccounts() {
		return repo.getAllAccounts();
	}

	public String addAccount(String account) {
			return repo.createAccount(account);
		}
	

	public String deleteAccount(Long id) {
		return repo.deleteAccount(id);
	}

	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}

	public String updateAccount(Long id, String input) {
	
		return repo.updateAccount(id, input);
	}
}
