/**
 * 
 */
package ae.co.pims.common;

/**
 * @author Babu
 *
 */
public interface PIMSMessageUtil {

	interface BANK_MESSAGE_DETAILS {
		String DUPLICATE_BANK_NAME_VALIDATION_MESSAGE = "Bank Name  %s is Already Exist pls change the bank name";
		String DUPLICATE_BANK_IFSC_VALIDATION_MESSAGE = "The IFSC Code  %s is Already Exist pls change the IFSC Code";
		String DUPLICATE_BANK_MOBILE_VALIDATION_MESSAGE = "The Mobile Number  %s is Already Exist pls change the Mobile Number";
		String DUPLICATE_BANK_EMIAL_VALIDATION_MESSAGE = "The Email  %s is Already Exist pls change the Email";
	}

}
