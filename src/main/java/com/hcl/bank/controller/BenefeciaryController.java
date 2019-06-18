package com.hcl.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bank.config.dto.BeneficiaryDto;
import com.hcl.bank.service.BenefeciaryService;

@RestController
@RequestMapping("/retailbanking")
public class BenefeciaryController {

	@Autowired
	private BenefeciaryService benefeciaryService;

	@GetMapping("/benfeciaries/{customerId}")
	public ResponseEntity<List<BeneficiaryDto>> getBenefeciaries(@PathVariable Long customerId) {
		List<BeneficiaryDto> listDto = benefeciaryService.fetchBenfeciaries(customerId);
		return new ResponseEntity<List<BeneficiaryDto>>(listDto, HttpStatus.OK);

	}

}
