
//Create a new class LoanServiceTest.java under src/test/java/com.learnwithbishnu.design_patterns.service package and add the following code.
package com.learnwithbishnu.design_patterns.service;

import com.learnwithbishnu.design_patterns.model.LoanApplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public  class  LoanServiceTest  {

 	@Test
 	void contextLoads() {
 	}

 	@Test
 	void testCreateLoanApplication() {
 		LoanApplication loanRequest = new LoanApplication(100000, 10.5, 12, "House", "John Doe");
 		LoanService loanService = new LoanService();
 		LoanApplication loanApplication = loanService.createLoanApplication(loanRequest);
 		assertNotNull(loanApplication);
 		assertEquals(100000, loanApplication.getLoanAmount());
 		assertEquals(10.5, loanApplication.getInterestRate());
 		assertEquals(12, loanApplication.getTenure());
 		assertEquals("House", loanApplication.getCollateral());
 		assertEquals("John Doe", loanApplication.getCoApplicant());
 	}
	 //add a new test method to test the getLoanApplication method
	 	@Test
	 	void testGetLoanApplication() {
		 	 		LoanService loanService = new LoanService();
	 		LoanApplication loanApplication = loanService.getLoanApplication(1L);
	 		assertNotNull(loanApplication);
	 		assertEquals(100000, loanApplication.getLoanAmount());
	 		assertEquals(10.5, loanApplication.getInterestRate());
	 		assertEquals(12, loanApplication.getTenure());
	 		assertEquals("House", loanApplication.getCollateral());
	 		assertEquals("John Doe", loanApplication.getCoApplicant());
		}
		//add the negetive test case for the getLoanApplication method
		@Test
	 	void testGetLoanApplicationNegative() {
	 		LoanService loanService = new LoanService();
	 		LoanApplication loanApplication = loanService.getLoanApplication(2L);
	 		assertNotNull(loanApplication);
	 		assertEquals(100000, loanApplication.getLoanAmount());
	 		assertEquals(10.5, loanApplication.getInterestRate());
	 		assertEquals(12, loanApplication.getTenure());
	 		assertEquals("House", loanApplication.getCollateral());
	 		assertEquals("John Doe", loanApplication.getCoApplicant());
		}


 }