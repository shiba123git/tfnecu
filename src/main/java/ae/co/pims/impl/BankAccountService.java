/**
 * 
 */
package ae.co.pims.impl;

import java.util.List;

import ae.co.pims.common.BankAccountDetails;

/**
 * @author Babu
 *
 */
public interface BankAccountService {

	public boolean createBankAccount(BankAccountDetails bao);

	public List<BankAccountDetails> getBankAccountDetails(String accountNumber);

	public List<BankAccountDetails> getBankAccountbyCustomerId(String customerId);

	public boolean isActive(String bankName);

}
