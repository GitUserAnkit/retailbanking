package com.hcl.bank.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bank.entity.Beneficiary;
import com.hcl.bank.entity.Customer;
import com.hcl.bank.entity.Transaction;
import com.hcl.bank.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl	customerServiceImpl;
	
	
	@GetMapping(value="/accountSummary/{customerId}")
	public Customer accountSummary(@PathVariable  Long customerId )
	{
	Customer customer=customerServiceImpl.getAccountSummary(customerId);
		
		return customer;
		
	}
	
	@PostMapping(value="/transfer/{id}")
	public Transaction fundTransfer(@RequestBody Transaction transaction,@PathVariable ("id") long id)
	{
	 customerServiceImpl.fundTransfer(transaction,id);
	 return transaction;
		
	}
	

}
