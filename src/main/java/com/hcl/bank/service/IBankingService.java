package com.hcl.bank.service;

import com.hcl.bank.entity.Beneficiary;

public interface IBankingService {

	Beneficiary addBenificiary(long id, Beneficiary beneficiary);
}
