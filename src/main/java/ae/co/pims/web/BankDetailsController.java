/**
 * 
 */
package ae.co.pims.web;

import ae.co.pims.impl.BankService;
import ae.co.pims.impl.BankServiceImpl;

/**
 * @author shmi0516
 *
 */
public class BankDetailsController {

	BankService bankService=new BankServiceImpl();
	
	
	public void createBank()
	{
		if(bankService.createBank(null));
	}
	
	
}
