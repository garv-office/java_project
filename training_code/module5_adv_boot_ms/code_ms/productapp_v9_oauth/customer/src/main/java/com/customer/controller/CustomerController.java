package com.customer.controller;

import com.customer.dto.ConfigDto;
import com.customer.dto.CustomerDto;
import com.customer.entities.Customer;
import com.customer.service.CustomerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	@Autowired
	private ConfigDto configDto;

	@GetMapping(path = "info")
	public ConfigDto getConfigDto(){
		return configDto;
	}

	@GetMapping(path = "customers")
	public List<CustomerDto> getAll(){
		return customerService.getAllCustomer();
	}
	
	@GetMapping(path = "customers/{id}")
	public CustomerDto getAnCustomer(@PathVariable(name = "id") int id){
		log.info("customer is loaded with id {}", id);
		return customerService.getCustomerById(id);
	}
}