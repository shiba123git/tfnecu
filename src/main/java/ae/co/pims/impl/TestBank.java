/**
 * 
 */
package ae.co.pims.impl;

import ae.co.pims.common.BankDetails;

/**
 * @author Babu
 *
 */
public class TestBank {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BankDetails bd = new BankDetails();
		bd.setAddress("Test");
		bd.setBankName("HDFC1234");
		bd.setEmail("jatni@sbi.com");
		bd.setIfsccode("SBIN0002071231");
		bd.setMobileNumber("72071185644");
		bd.setOnline(true);
		bd.setUrl("https://www.sbi.com");
		BankService bankService = new BankServiceImpl();
		boolean status = bankService.createBank(bd);

		/*
		 * BankService bankService = new BankServiceImpl();
		 * bankService.getBankbyId(new BigInteger("911235689789498"));
		 */

	}

}
