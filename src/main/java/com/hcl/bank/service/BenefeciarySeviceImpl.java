package com.hcl.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.config.dto.BeneficiaryDto;
import com.hcl.bank.entity.Beneficiary;
import com.hcl.bank.repository.BenefeciaryRepository;

@Service
public class BenefeciarySeviceImpl implements BenefeciaryService {
	/*
	 * @Autowired private CustomerRepository customerRepository;
	 */
	@Autowired
	private BenefeciaryRepository benefeciaryRepository;

	@Override
	public List<BeneficiaryDto> fetchBenfeciaries(Long customerId) {
	
		List<BeneficiaryDto> listDto = new ArrayList<>();
		//Optional<Customer> customer = customerRepository.findById(customerId);
		//System.out.println(customer.get().getBeneficiaryArr().size());
		List<Beneficiary> listBenefeciary = benefeciaryRepository.getBenfeciary(customerId);
		for (Beneficiary list : listBenefeciary) {
			
			BeneficiaryDto beneficiary = new BeneficiaryDto();
			beneficiary.setBeneficiaryAccNo(list.getBeneficiaryAccNo());
			beneficiary.setId(list.getId());
			beneficiary.setName(list.getName());
			beneficiary.setBeneficiaryIfscCode(list.getBeneficiaryIfscCode());
			listDto.add(beneficiary);
		}
		return listDto;

	}

}
