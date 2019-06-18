package com.hcl.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.dto.BeneficiaryDto;
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
	public Beneficiary addBenificiary(long id, BeneficiaryDto beneficiary) {
		
		Beneficiary resultBeneficiary = null;
		Beneficiary beneficiary1 = new Beneficiary();
		
		beneficiary1.setName(beneficiary.getName());
		beneficiary1.setBeneficiaryIfscCode (beneficiary.getBeneficiaryIfscCode() );
		beneficiary1.setBeneficiaryAccNo (beneficiary.getBeneficiaryAccNo());
		
		Optional<Customer> customer = customerRepository.findById(id);
		if(customer.isPresent()) {
			System.out.println("Beneficiary Name: " + beneficiary.getName());
			beneficiary1.setCustomer(customer.get());
			
			resultBeneficiary = beneficiaryRepository.save(beneficiary1);
		}
		return resultBeneficiary;
	}
}