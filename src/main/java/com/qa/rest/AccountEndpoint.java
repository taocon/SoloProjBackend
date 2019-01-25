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

@Path("/acc")
public class AccountEndpoint {

	@Inject
	private AccountService service;

	@Path("/get")
	@GET
	@Produces({ "application/json" })
	public String getAllAccount() {
		return service.getAllAccounts();
	}

	@Path("/add")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
		return service.addAccount(account);
	}

	@Path("/del/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") Long id) {
		return service.deleteAccount(id);
	}

	@Path("/update/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateAccount(@PathParam("id") Long id, String input) {

		return service.updateAccount(id, input);

	}

	public void setService(AccountService service) {
		this.service = service;
	}

}
