package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Account;
import com.qa.persistence.domain.Item;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ItemDBRepository implements ItemRepository {
	
	
	
	
	
// tells the manager to look in the persistence xml and use the persistence unit called primary
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;


	public String getAllItems() {
		Query query= manager.createQuery("Select i FROM Item i");
		Collection<Item> result = (Collection<Item>) query.getResultList();
		return util.getJSONForObject(result);
	}
	
	public String getAnItem(Long id) {
		Item itemInDB = findItem(id);
		if (itemInDB != null) {
			return util.getJSONForObject(itemInDB);
		}
		return "{\"message\": \"account sucessfully deleted\"}";
	}
	
	private Item findItem(Long id) {
		return manager.find(Item.class, id);
	}


}