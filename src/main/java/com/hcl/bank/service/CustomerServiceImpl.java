package com.hcl.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.bank.dto.CustomerDto;
import com.hcl.bank.entity.Customer;
import com.hcl.bank.repository.CustomerRepository;

@Service
@Transactional

public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository customerRepository;







	@Override
	public CustomerDto getAccountSummary(Long customerId) {
	Customer customer=customerRepository.findById(customerId).orElse(null);
	
		CustomerDto customerDto=new CustomerDto();
		BeanUtils.copyProperties(customer, customerDto);
		return customerDto;
	}


}
