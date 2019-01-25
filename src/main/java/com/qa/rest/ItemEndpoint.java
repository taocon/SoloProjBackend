package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.business.service.AccountService;
import com.qa.business.service.ItemService;

@Path("/item")
public class ItemEndpoint {

	@Inject
	private ItemService service;

	@Path("/get")
	@GET
	@Produces({ "application/json" })
	public String getAllItem() {
		return service.getAllItems();
	}

	public void setService(ItemService service) {
		this.service = service;
	}

}
