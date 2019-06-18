package com.hcl.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.entity.Beneficiary;
import com.hcl.bank.entity.Customer;
import com.hcl.bank.repository.IBenificiaryRepository;
import com.hcl.bank.repository.ICustomerRepository;

@Service
public class BankingServiceImpl implements IBankingService {

	@Autowired
	private ICustomerRepository customerRepository;
	
	@Autowired
	private IBenificiaryRepository beneficiaryRepository;
	
	@Override
	public Beneficiary addBenificiary(long id, Beneficiary beneficiary) {
		
		Beneficiary resultBeneficiary = null;
		Optional<Customer> customer = customerRepository.findById(id);
		if(customer.isPresent()) {
			beneficiary.setCustomer(customer.get());
			resultBeneficiary = beneficiaryRepository.save(beneficiary);
		}
		return resultBeneficiary;
	}
}