package com.hcl.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.bank.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Long> {

}
