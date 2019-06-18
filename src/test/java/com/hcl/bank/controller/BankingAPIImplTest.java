package com.hcl.bank.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.bank.dto.BeneficiaryDto;
import com.hcl.bank.entity.Beneficiary;
import com.hcl.bank.service.BankingServiceImpl;

@RunWith(SpringRunner.class)
public class BankingAPIImplTest {
	
	@InjectMocks
	BankingAPIImpl bai;
	
	@Mock
	BankingServiceImpl bsi;
	
	@Test
	void testAddBeneficiary () {
		Beneficiary b = new BeneficiaryDto( 12345, "abcde", "Anirban");
		when (bsi.addBenificiary (1, b)).thenReturn(b);
		Beneficiary test = bai.addBeneficiary(1L, b);
		assertEquals(test.getBeneficiaryAccNo(), b.getBeneficiaryAccNo());
		verify(bsi,times(1)).addBenificiary (1, b);
	}

}
