package com.hcl.bank.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bank.entity.Beneficiary;

@RestController
public class BankingAPIImpl {
	
	@PostMapping(value = "/beneficiary/{customerid}")
	public Beneficiary addBeneficiary(@PathVariable ("customerid") Long customerid, Beneficiary beneficiary) {
		
		return null;
	}

}
