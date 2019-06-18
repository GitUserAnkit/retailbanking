package com.hcl.bank.service;

import com.hcl.bank.entity.Customer;

public interface CustomerService {
	public Customer getAccountSummary(Long customerId);

}
