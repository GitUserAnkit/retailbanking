package com.hcl.bank.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.entity.Beneficiary;
import com.hcl.bank.entity.Customer;
import com.hcl.bank.entity.Transaction;
import com.hcl.bank.repository.BeneficiaryRepository;
import com.hcl.bank.repository.CustomerRepository;
import com.hcl.bank.repository.TransactionRepository;


@Service
public class CustomerServiceImpl {
	
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	TransactionRepository transactionRepository;
@Autowired
BeneficiaryRepository beneficiaryRepository;

	public Customer getAccountSummary(Long customerId) {
		
		Customer customer=customerRepository.findById(customerId).get();
		
		return customer;
	}

	public Customer findCustomerById(Long customerId) {
		Customer customer=customerRepository.findById(customerId).get();
		
		
		return null;
	}

	public Transaction fundTransfer(Transaction transaction, long id) {
		Customer customer=customerRepository.findById(transaction.getCustomer().getCustomerId()).get();
		Beneficiary beneficiary2=beneficiaryRepository.findById(id).get();
		Double fromBalance=customer.getBalance();
		Double toBalance=transaction.getAmountTrans();
		if(toBalance!=0 )
		{
			if(fromBalance>toBalance)
			{
				Transaction creditTransaction =new Transaction();
				Transaction debitTransaction=new Transaction();
		Double debitBalance=fromBalance-toBalance;
		Double creditBalance=fromBalance+toBalance;
		customer.setBalance(debitBalance);
		
		debitTransaction.setAmountTrans(debitBalance);
		debitTransaction.setDescription(transaction.getDescription());
		debitTransaction.setToAccNo(beneficiary2.getBeneficiaryAccNo());
		debitTransaction.setTranDate(transaction.getTranDate());
		debitTransaction.setCustomer(customer);
		transactionRepository.save(debitTransaction);
		
		customerRepository.save(customer);
		customer.setBalance(creditBalance);
		creditTransaction.setAmountTrans(creditBalance);
		creditTransaction.setDescription(transaction.getDescription());
		creditTransaction.setToAccNo(beneficiary2.getBeneficiaryAccNo());
		creditTransaction.setTranDate(transaction.getTranDate());
		
		transactionRepository.save(creditTransaction);
	
		
			}
		}
		return transaction;
		
		
	}

}
