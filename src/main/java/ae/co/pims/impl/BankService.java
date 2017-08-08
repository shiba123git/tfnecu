/**
 * 
 */
package ae.co.pims.impl;

import java.util.List;

import ae.co.pims.common.BankDetails;

/**
 * @author shmi0516
 *
 */
public interface BankService<T> {
	public boolean createBank(BankDetails bao);
	public List<BankDetails>  getBankbyName(String name);
	public List<BankDetails>  getBankbyifscCode(String ifsccode);
	public boolean isActive(String bankName);

}
