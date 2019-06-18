package com.hcl.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bank.dto.BeneficiaryDto;
import com.hcl.bank.entity.Beneficiary;
import com.hcl.bank.service.IBankingService;

@RestController
public class BankingAPIImpl {
	
	@Autowired
	IBankingService bankingService;
	
	@PostMapping(value = "/beneficiary/{customerid}")
	public Beneficiary addBeneficiary(@PathVariable ("customerid") Long customerid, @RequestBody BeneficiaryDto beneficiary) {
		
		return bankingService.addBenificiary(customerid, beneficiary) ;
	}

}
