package com.qa.business.service;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;


import com.qa.persistence.repository.ItemRepository;
import com.qa.util.JSONUtil;

public class ItemServiceImpl implements ItemService {

	@Inject
	private ItemRepository repo;

	@Inject
	private JSONUtil util;


	public String getAllItems() {
		return repo.getAllItems();
	}


	public String getAnItem(Long id) {
		return repo.getAnItem(id);
	
	}


}
