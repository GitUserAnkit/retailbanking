package com.hcl.bank.service;

import java.util.List;

import com.hcl.bank.dto.CustomerDto;

public interface CustomerService {

	CustomerDto getAccountSummary(Long customerId);

}
