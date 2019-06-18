package com.hcl.bank.service;

import com.hcl.bank.entity.Beneficiary;
import com.hcl.bank.entity.Customer;
import com.hcl.bank.entity.Transaction;

public interface CustomerService {
	public Customer getAccountSummary(Long customerId);
	public Customer findCustomerById(Long customerId);
	public Transaction fundTransfer(Transaction transaction,Long id);

}
