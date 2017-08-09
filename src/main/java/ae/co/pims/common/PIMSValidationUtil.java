/**
 * 
 */
package ae.co.pims.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ae.co.pims.impl.oracle.connection.hibernate.HibernateAnnotationUtil;

/**
 * @author shmi0516
 *
 */
public class PIMSValidationUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(HibernateAnnotationUtil.class);
	private static final String FULLY_QUALIFIED_CLASS_NAME = "ae.co.pims.impl.oracle.connection.hibernate.HibernateAnnotationUtil";
	private static SessionFactory sessionfactory = null;
	private static Session session=null;
	private Transaction transaction=null;
	
	
	@SuppressWarnings("unused")
	private static boolean isValidUser(String userName,String password)
	{
		return false;
	}
	@SuppressWarnings("unused")
	private static boolean isBankActive(String bankName)
	{
		return false;
	}
	@SuppressWarnings("unused")
	private static boolean isAccountActive(String bankName)
	{
		return false;
	}
	@SuppressWarnings("unused")
	private static boolean isBankisEligibleforDelete(String bankName)
	{
		return false;
	}
	@SuppressWarnings("unused")
	private static boolean isbankAccountNumberDuplicate(String accountNumber)
	{
		
		return false;
		
	}
	
	
	
	
}
