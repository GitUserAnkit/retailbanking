package com.hcl.bank.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.entity.Customer;
import com.hcl.bank.repository.CustomerRepository;


@Service
public class CustomerServiceImpl {
	
	@Autowired
	CustomerRepository customerRepository;

	public Customer getAccountSummary(Long customerId) {
		
		Customer customer=customerRepository.findById(customerId).get();
		
		return customer;
	}

}
