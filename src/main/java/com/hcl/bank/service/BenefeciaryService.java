package com.hcl.bank.service;

import java.util.List;

import com.hcl.bank.config.dto.BeneficiaryDto;

public interface BenefeciaryService {

	List<BeneficiaryDto> fetchBenfeciaries(Long customerId);

}
